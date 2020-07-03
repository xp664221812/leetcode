/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
/*
记住这段代码，这段代码是遍历数组里面的两两几种组合方式
for (int i = 0; i < height.length - 1; i++) {
    for (int j = i + 1; j < height.length; j++) {

    }
}
**/
//时间复杂度o(n^2)
class Solution1 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[i]) * (j - i);
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                max = Math.max(area, max);
            }
        }
        return max;
    }

}

// 时间复杂度o(n)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            int area = minHeight * (j - i + 1);
            max = Math.max(max, area);
        }

        return max;
    }

    public int maxArea2(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            if (height[i] > height[j]) {
                int area=(j-i)*height[j];
                max=Math.max(area, max);
                j--;
            }else{
                int area=(j-i)*height[i];
                max=Math.max(area, max);
                i++;
            }
        }
        return max;
    }
}

// @lc code=end
