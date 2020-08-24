/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 * 
 * dp[m：word1.subStr(0,m)][n:word.subStr(0,n)]代表的是
 */

// @lc code=start

class Solution {
    public int minDistance(String word1, String word2) {

        int n1 = word1.length()+1;
        int n2 = word2.length()+1;

        int dp[][] = new int[n1][n2];
        for (int i = 1; i <= n1; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }

        for (int i = 1; i < n2; i++) {
            dp[0][i] = dp[0][i - 1] + 1;
        }

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j]=Math.min(dp[i-1][j-1]+1,Math.min(dp[i-1][j]+1,dp[i][j-1]+1));
                }
            }
        }

        return dp[word1.length()][word2.length()];
    }
}
// @lc code=end
