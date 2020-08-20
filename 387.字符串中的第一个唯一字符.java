import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
*  给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
*示例：
*s = "leetcode"
*返回 0

*s = "loveleetcode"
*返回 2
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);

            // if (map.get(ch[i]) == null) {
            // map.put(ch[i], 1);
            // } else {
            // map.put(ch[i], map.get(ch[i]) + 1);
            // }

        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
