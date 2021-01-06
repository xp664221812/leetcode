import javax.swing.text.rtf.RTFEditorKit;

import sun.security.util.Length;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    // 暴力求解
    // public String longestPalindrome(String s) {
    // if (s.length() == 1 || s.length() == 0) {
    // return s;
    // }
    // char[] array = s.toCharArray();
    // int left = 0;
    // int len = 1;
    // for (int i = 0; i < array.length - 1; i++) {
    // for (int j = i + 1; j < array.length; j++) {
    // if (j - i - 1 >= 0) {
    // if (isPalindrome(i, j, array)) {
    // left = i;
    // len = j - i + 1;
    // }
    // }
    // }
    // }

    // return s.substring(left, left + len - 1);
    // }

    // private boolean isPalindrome(int left, int right, char[] array) {
    // while (left < right) {
    // if (array[left] != array[right]) {
    // return false;
    // } else {
    // left++;
    // right--;
    // }
    // }

    // return true;
    // }

    // 中心扩散法

    // public String longestPalindrome(String s) {
    // if (s.length() == 1 || s.length() == 0) {
    // return s;
    // }
    // char[] array = s.toCharArray();
    // int left = 0;
    // int len = 1;
    // for (int i = 0; i < array.length - 1; i++) {

    // int length1 = expandAroundCenter(left, left + 1, array);
    // int length2 = expandAroundCenter(left, left, array);
    // int currentMaxLength = Math.max(length1, length2);
    // if (currentMaxLength > len) {
    // left = i;
    // len = currentMaxLength;
    // }
    // }

    // return s.substring(left, left + len - 1);
    // }

    // public int expandAroundCenter(int left, int right, char[] array) {
    // while (left >= 0 && right < array.length - 1) {
    // if (array[left] != array[right]) {
    // break;
    // } else {
    // left--;
    // right++;
    // }
    // }

    // return right - left+1;
    // }

    public String longestPalindrome(String s) {
        char[] array = s.toCharArray();

        int left = 0;
        int length = 1;

        for (int i = 0; i < array.length; i++) {
            int length1=expand(left, left+1, array);
            int length2=expand(left, left, array);
        }

    }

    public int expand(int left, int right, int[] array) {
        while (left >= 0 && right < array.length - 1) {
            if (array[left] != array[right]) {
                break;
            } else {
                left--;
                right++;
            }
        }

        return right - left - 1;
    }

}
// @lc code=end
