/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start


//有问题的
class Solution {
    int biggest = 0;

    public int rob(int[] nums) {
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


}
// @lc code=end
