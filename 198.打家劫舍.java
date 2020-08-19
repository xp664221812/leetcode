/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 * 
 * 示例 1：

输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。
示例 2：

输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * 
 * 
 */

// @lc code=start

//有问题的
class Solution {
    int biggest = 0;

    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[][] dp = new int[nums.length][2];
        //0表示没偷第i个，1表示偷了
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][0]);
            dp[i][1] = Math.max(dp[i-1][0], 0) + nums[i];
        }

        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);
    }

    public int rob1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        _recur(nums, 0, nums[0]);
        if (nums.length > 1) {
            _recur(nums, 1, nums[1]);
        }

        System.out.println(biggest);
        return biggest;
    }

    public void _recur(int[] nums, int index, int sum) {
        // terminator
        if (index + 2 >= nums.length) {
            if (sum > biggest) {
                biggest = sum;
            }
            return;
        }
        if (index + 2 < nums.length) {
            _recur(nums, index + 2, sum + nums[index + 2]);
        }
        if (index + 3 < nums.length) {
            _recur(nums, index + 3, sum + nums[index + 3]);
        }

    }


    public int rob3(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }

        int[][]dp=new int[nums.length][2];

        dp[0][0]=0;
        dp[0][1]=nums[0];

        for (int i = 0; i < nums.length; i++) {
            dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1]=dp[i-1][0]+nums[i];
        }

        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);


    }

}
// @lc code=end
