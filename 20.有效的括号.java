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
            if (item == '(' || item == '[' || item == '{') {
                stack.push(item);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char result = stack.pop();
                if ((result == '(' && item == ')') || (result == '[' && item == ']')
                        || (result == '{' && item == '}')) {
                    continue;
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }

    public boolean isValid1(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char character : chars) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char item = stack.pop();
                if ((item == '(' && character == ')') || (item == '[' && character == ']')
                        || (item == '{' && character == '}')) {
                        continue;    
                }else{
                    return false;
                }

            }
            
        }
        return stack.isEmpty();
    }
}
// @lc code=end
