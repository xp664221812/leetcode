/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        int sign = 1, total = 0, index = 0;
        str = str.trim();

        char[] ch = str.toCharArray();

        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        } else {
            return 0;
        }

        while(index<str.length()){
            
        }




        // for (int i = 0; i < ch.length; i++) {
        // if(ch[i]=='-'){

        // }

        // }

    }
}
// @lc code=end
