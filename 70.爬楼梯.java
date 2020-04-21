/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
// class Solution {
//     public int climbStairs(int n) {
//         int[] memory = new int[n + 1];
//         return climb_stairs(0, n, memory);
//     }

//     public int climb_stairs(int i, int n, int[] mem) {
//         if (i > n) {
//             return 0;
//         }
//         if (i == n) {
//             return 1;
//         }
//         if (mem[i] > 0) {
//             return mem[i];
//         }
//         mem[i] = climb_stairs(i + 1, n, mem) + climb_stairs(i + 2, n, mem);

//         return mem[i];
//     }

// }

class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <=n; i++) {
            int third=first+second;
            first=second;
            second=third;
        }
        return second;
    }

}

// @lc code=end
