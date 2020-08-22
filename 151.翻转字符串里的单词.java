import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * @lc app=leetcode.cn id=151 lang=java
 *  输入: "the sky is blue"
    输出: "blue is sky the"

    输入: "  hello world!  "
    输出: "world! hello"
    解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    //trim split reverse
    public String reverseWords(String s) {
        //" +表示一个或多个空格"
        String[]array = s.trim().split(" +");
        Collections.reverse(Arrays.asList(array));
        return String.join(" ", array);
    }

}
// @lc code=end
