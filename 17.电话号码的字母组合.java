import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    Map<String, String> map = new HashMap<>();
    List<String> list=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }

        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        List<String> list = new ArrayList<>();

        _search("", digits, 0, list);
        return list;

    }

    public void _search(String s, String digits, int level, List<String> resullt) {
        // terminator
        if (level == digits.length()) {
            resullt.add(s);
            return;
        }

        // process
        String letters = map.get(String.valueOf(digits.charAt(level)));

        for (int i = 0; i < letters.length(); i++) {
            // drill dowmn
            _search(s + letters.charAt(i), digits, level + 1, resullt);
        }

    }

    public List<String> letterCombinations1(String digits) {
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        _search1("", digits, list, 0);
        return list;

    }

    private void _search1(String s, String digits, List<String> result, int level) {
        if (level == digits.length()) {
            result.add(s);
        }

        String letters = map.get(String.valueOf(digits.charAt(level)));

        for (int i = 0; i < letters.length(); i++) {
            _search1(s+letters.charAt(level), digits, result, level+1);
        }


    }

}
// @lc code=end
