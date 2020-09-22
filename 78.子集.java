import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 * 输入: nums = [1,2,3]
输出:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        _recur(ans, nums, new ArrayList<Integer>(), 0);

        return ans;
    }

    public void _recur(List<List<Integer>> ans, int[] nums, ArrayList<Integer> list, int index) {
        // terminator
        if (index == nums.length) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        _recur(ans, nums, list, index+1);

        list.add(nums[index]);
        _recur(ans, nums, list, index + 1);

        list.remove(list.size()-1);

    }

    /**
     * 2020 0922
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets1(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
       

        return ans;
    }


    private void _recur1(List<List<Integer>> ans,int[]nums,int index,ArrayList<Integer> list){
        if(index==nums.length){
            ans.add(list);
            return;
        }

        _recur1(ans, nums, index+1,(ArrayList<Integer>)list.clone());

        list.add(nums[index]);

        _recur1(ans, nums, index+1,(ArrayList<Integer>)list.clone());


    }

}
// @lc code=end
