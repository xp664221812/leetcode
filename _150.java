import java.util.Stack;

//逆波兰表达式

/*
输入: ["2", "1", "+", "3", "*"]
输出: 9
解释: ((2 + 1) * 3) = 9
**/
class Solution {

    private int containSymbal(String token) {
        return "+-*/".indexOf(token);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            int index = containSymbal(token);
            if (index != -1) {
                int right = stack.pop();
                int left = stack.pop();
                switch (index) {
                case 0:
                    stack.push(left + right);
                    break;
                case 1:
                    stack.push(left - right);
                    break;
                case 2:
                    stack.push(left * right);
                    break;
                case 3:
                    stack.push(left / right);
                    break;
                }

            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

}