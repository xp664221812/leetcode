/*
 * @lc app=leetcode.cn id=1370 lang=java
 *
 * [1370] 上升下降字符串
 *  1.从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
    2.从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
    3.重复步骤 2 ，直到你没法从 s 中选择字符。
    4.从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
    5.从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
    6.重复步骤 5 ，直到你没法从 s 中选择字符。
    7.重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。


    输入：s = "aaaabbbbcccc"
    输出："abccbaabccba"
    解释：第一轮的步骤 1，2，3 后，结果字符串为 result = "abc"
    第一轮的步骤 4，5，6 后，结果字符串为 result = "abccba"
    第一轮结束，现在 s = "aabbcc" ，我们再次回到步骤 1
    第二轮的步骤 1，2，3 后，结果字符串为 result = "abccbaabc"
    第二轮的步骤 4，5，6 后，结果字符串为 result = "abccbaabccba"

 */



/**
 * 题目的意思：先升序，后降序，一直循环到获取的字符串长度和原来的长度一样
 * 
 * 思路：由于都是小写字母，将字母放在26个桶（数组）中，然后先升序，后降序
 * 
 */


// @lc code=start
class Solution {
    public String sortString(String s) {
        int[] bucket = new int[26];

        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i) - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            for (int i = 0; i < bucket.length; i++) {
                if (bucket[i] != 0) {
                    result.append((char) ('a' + i));
                }

                for (int j = bucket.length - 1; j >= 0; j--) {
                    if (bucket[j] != 0) {
                        result.append((char) ('a' + j));
                    }
                }

            }
        }
        return result.toString();

    }
}
// @lc code=end
