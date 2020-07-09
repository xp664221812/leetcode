/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 * 
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
*
    示例:

    输入: [-2,1,-3,4,-1,2,1,-5,4],
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */

// @lc code=start
class Solution {
    // 穷举法
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = nums[0];
       
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int m=Math.max(nums[i], nums[j]);
                int r = Math.max(_sum(nums, i, j), Math.max(nums[i], nums[j]));
                if (r > max) {
                    max = r;
                }
            }
        }
        return max;
    }

    private int _sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

}
// @lc code=end
