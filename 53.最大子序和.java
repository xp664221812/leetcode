import java.util.Arrays;

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
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] dp = nums;

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], 0) + nums[i];
        }
        int max=dp[0];
        for (int i = 1; i < dp.length; i++) {
            if(max<dp[i]){
                max=dp[i];
            }
        }

        return max;
        
    }

}
// @lc code=end
