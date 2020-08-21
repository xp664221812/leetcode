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
        if("".equals(str)){
            return 0;
        }

        char[] ch = str.toCharArray();

        if (str.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (str.charAt(index) == '+') {
            index++;
        } else {
            if(str.charAt(index) - '0'>9){
                return 0;
            }
        }

        while (index < str.length()) {
            int r = str.charAt(index) - '0';
            if (r < 0 || r > 9) {
                break;
            }
            if (total > (Integer.MAX_VALUE - r) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            total = total * 10 + r;
            index++;

        }

        return total * sign;

    }
}
// @lc code=end
