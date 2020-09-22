import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=474 lang=java
 *
 * [474] 一和零
 * 输入: Array = {"10", "0001", "111001", "1", "0"}, m = 5, n = 3
输出: 4

解释: 总共 4 个字符串可以通过 5 个 0 和 3 个 1 拼出，即 "10","0001","1","0" 
 */

// @lc code=start
class Solution {

    int ans = 0;

    public int findMaxForm(String[] strs, int m, int n) {
        if (strs.length == 0) {
            return 0;
        }
        return ans;
    }

    public void _recur(String[] strs, int index, int m, int n, int result) {

        if (index == strs.length || (m == 0 && n == 0)) {
            if (result > ans) {
                ans = result;
            }
            return;
        }

        String str = strs[index];
        int size0 = 0;
        int size1 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0') {
                size0++;
            }
            if (c == '1') {
                size1++;
            }
        }
        if (size0 <= m && size1 <= n) {

            _recur(strs, index + 1, m, n, result);

            _recur(strs, index + 1, m - size0, n - size1, result + 1);

        } else {
            _recur(strs, index + 1, m, n, result);
        }

    }

    // 动态规划1
    public int findMaxForm1(String[] strs, int m, int n) {
        if (strs.length == 0 || (m == 0 && n == 0)) {
            return 0;
        }

        for (int i = 0; i < strs.length; i++) {
            int size0 = 0;
            int size1 = 0;
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    size0++;
                } else if (str.charAt(j) == '1') {
                    size1++;
                }
            }

            
        }

        return ans;
    }

}
// @lc code=end
