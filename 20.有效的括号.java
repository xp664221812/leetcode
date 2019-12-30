import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char item : chars) {
            if (item == '(' || item == '[') {
                stack.push(item);
            } else {
                char result = stack.pop();
                if ((result == '(' && item == ')') || (result == '[' && item == ']')) {
                    continue;
                } else {
                    return false;
                }

            }
        }

        return true;

    }
}
// @lc code=end
