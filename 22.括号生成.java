import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        _recur(0, 0, n, "");

        return list;
    }

    /** 递归模板 */
    private void _recur(int left, int right, int n, String current) {
        // terminator
        if (left == n && right == n) {
            list.add(current);
            System.out.println(current);
            return;
        }

        // process
        String s1 = current + "(";
        String s2 = current + ")";

        // drill down
        // 左括号随时都可以加，只要不超标，添加右括号的
        // 时候数量要小于左括号
        if(left<n){
            //添加左括号
            _recur(left + 1,right, n, s1);
        }
        if(right<left){
            //添加右括号
            _recur(left,right+1, n, s2);
        }

        // revers statue

    }



    public List<String> generateParenthesis1(int n) {
        generateParenthesis1(n,0,0,"");

        return list;
    }

    private void generateParenthesis1(int n,int left,int right,String current){
        if(left==3&&right==3){
            list.add(current);
            System.out.println(current);
            return;
        }

        String s1=current+"(";
        String s2=current+")";

        if(left<n){
            generateParenthesis1(n, left+1, right, s1);
        }
        if(right<left){
            generateParenthesis1(n, left, right+1, s2);
        }



    }




    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateParenthesis(3);
    }

}
// @lc code=end
