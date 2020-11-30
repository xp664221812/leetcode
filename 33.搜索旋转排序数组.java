/*
 * @lc app=leetcode.cn id=33 lang=java
 *( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;

            } else if (nums[0] <= nums[mid]) {
                // 如果左边是单调递增的
                if (nums[0] <= target && target < nums[mid]) {
                    // 目标在左边
                    right = mid - 1;
                } else {
                    // 目标在右边边
                    left = mid + 1;
                }

            } else {
                // 如果左边不是单调递增的，那右边肯定是单调递增的
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    // 目标在右边
                    left = mid + 1;
                } else {
                    // 目标在左边
                    right = mid - 1;
                }

            }
        }

        return -1;
    }
}
// @lc code=end
