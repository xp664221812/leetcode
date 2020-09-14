import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        _recur(k, n, 0, 0, new ArrayList<>(), 1);
        return ans;
    }

    // k指数组的内的个数，n指的是数组需要达到的和
    public void _recur(int k, int n, int currentTotal, int currentCount, ArrayList<Integer> list, int index) {
        if (currentCount == k && currentTotal == n) {
            ans.add(list);
            return;
        }
        if (currentCount == k || currentTotal > n || index > 9) {
            return;
        }

        _recur(k, n, currentTotal, currentCount, (ArrayList) list.clone(), index + 1);

        list.add(index);
        _recur(k, n, currentTotal + index, currentCount + 1, (ArrayList) list.clone(), index + 1);

    }
}
// @lc code=end
