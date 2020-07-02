/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 * 
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

    你可以假设数组是非空的，并且给定的数组总是存在多数元素。


示例 1:

输入: [3,2,3]
输出: 3
 * 
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
       return _recur(nums, 0, nums.length-1);
    }


    public int _recur(int[] nums,int low,int high){
        //terminator
        if(low==high){
            return nums[low];
        }

        //process and drill down
        int mid=(high-low)/2+low;
        int left=_recur(nums, low, mid);
        int right=_recur(nums, mid+1, high);

        if(left==right){
            return left;
        }

        int leftCount=count(nums, left, low, high);
        int rightCount=count(nums, right, low, high);

        return leftCount>=rightCount? left:right;


    }

    private int count(int[] nums,int num,int low,int high){
        int count=0;
        for (int i = low; i <= high; i++) {
            if(nums[i]==num){
                count++;
            }
        }
        return count;

    }


}
// @lc code=end

