import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {

        // dp[i]表示nums[i]必须选中的最长子序列

        int length = nums.length;
        if (length < 2) {
            return length;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);


         for (int i = 1; i < dp.length; i++) {
             for (int j = 0; j < i; j++) {
                 if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                 }
             }
         }
         int ans=0;
         for (int i = 0; i < dp.length; i++) {
             ans=Math.max(ans, dp[i]);
         }
         return ans;

    }
}


class Solution1 {
    public int lengthOfLIS(int[] nums) {
        int[]dp=new int[nums.length];

        Arrays.fill(dp, 1);

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int max=1;
        for (int i = 0; i < dp.length; i++) {
            max=Math.max(max, dp[i]);
        }

        return max;
    }
}
// @lc code=end
