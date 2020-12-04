/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                ans++;
            }
        }
        return ans + 1;

    }
}
// @lc code=end
