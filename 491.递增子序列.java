import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=491 lang=java
 *
 * [491] 递增子序列
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        _recur(0, new ArrayList<>(), nums);
        return ans;
    }

    private void _recur(int index, List<Integer> list, int[] nums) {
        // terminate
        if (index == nums.length) {
            ans.add(list);
            return;
        }
        _recur(index + 1, list, nums);
        list.add(nums[index]);
        
        _recur(index + 1, list, nums);
        list.remove(o)
    }
}
// @lc code=end
