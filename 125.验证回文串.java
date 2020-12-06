/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 * 说明：本题中，我们将空字符串定义为有效的回文串。

示例 1:

输入: "A man, a plan, a canal: Panama"
输出: true
示例 2:

输入: "race a car"
输出: false
 */

// @lc code=start
class Solution {
    // public boolean isPalindrome(String s) {
    // StringBuffer buffer = new StringBuffer();
    // for (int i = 0; i < s.length(); i++) {
    // if (Character.isLetterOrDigit(s.charAt(i))) {
    // buffer.append(Character.toLowerCase(s.charAt(i)));
    // }
    // }
    // for (int i = 0, j = buffer.length() - 1; i < buffer.length(); i++, j--) {
    // if (buffer.charAt(i) != buffer.charAt(j)) {
    // return false;
    // }
    // }
    // return true;
    // }

    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }

        int left = 0, right = s.length() - 1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }else{
                left++;
                right--;
            }
        }

        return true;

    }
}
// @lc code=end
