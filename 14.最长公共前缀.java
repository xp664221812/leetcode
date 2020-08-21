/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c=strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(i>=strs[j].length()){
                    return strs[0].substring(0,i);
                }

                if(c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
        //test git add
    }
}
// @lc code=end

