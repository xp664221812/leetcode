/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i * 2 <= n; i++) {
            while (n % i == 0) {
                boolean match = true;
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }

                }
                if (match) {
                    return true;
                }
            }

        }

        return false;

    }
}
// @lc code=end
