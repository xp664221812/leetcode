import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 * 给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        Object: for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    break Object;
                }
            }
        }
        return array;
    }

    public int[] twoSum1(int[] nums, int target) {

        int[] array = new int[2];
        Object: for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = nums[i];
                    array[1] = nums[j];
                    break Object;
                }
            }
        }

        return array;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] array = new int[2];
        Object: for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    array[0] = array[i];
                    array[1] = array[j];
                    break Object;
                }
            }
        }
        return array;
    }

}

// 两遍hash
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && i != map.get(need)) {
                return new int[] { i, map.get(need) };
            }

        }
        return null;

    }

}

// 一遍hash
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need) && i != map.get(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);

        }
        return null;

    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

/**
 * 20200922
 */
class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[] { i, map.get(need) };
            }
            map.put(need, i);
        }
        return null;
    }
}

class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { nums[i], i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
// @lc code=end
