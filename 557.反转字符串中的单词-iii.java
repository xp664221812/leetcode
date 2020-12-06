import java.util.Stack;

/*
 * @lc app=leetcode.cn id=557 lang=java
 * 输入："Let's take LeetCode contest"
    输出："s'teL ekat edoCteeL tsetnoc"
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        int left = 0;
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        while (left < s.length()) {
            if (s.charAt(left) == ' ' || (s.length() - 1) == left) {
                if((s.length() - 1) == left){
                    stack.push(s.charAt(left));
                    left++;
                }
                int length = stack.size();
                while (!stack.empty()) {
                    array[left - length] = stack.pop();
                    length--;
                }
                left++;
            } else {
                stack.push(s.charAt(left));
                left++;
            }
        }

        return String.valueOf(array);

    }
}
// @lc code=end
