import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        _recur(ans, nums, new ArrayList<Integer>(), 0);

        return ans;
    }

    public void _recur(List<List<Integer>> ans, int[] nums, ArrayList<Integer> list, int index) {
        // terminator
        if (index == nums.length) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        _recur(ans, nums, list, index+1);

        list.add(nums[index]);
        _recur(ans, nums, list, index + 1);

        list.remove(list.size()-1);

    }

}
// @lc code=end
