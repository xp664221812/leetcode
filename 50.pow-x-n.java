/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        if (n >= 0) {
            return _recur(x, n);
        } else {
            return 1.0 / _recur(x, -n);
        }
    }

    /**
     * 分治 1.teminator 2.progress(split your big problem) 3.drill
     * down(subproblems),merge(subresult) 4.reverse result
     */
    public double _recur(double x, long n) {

        if (n == 0) {
            return 1;
        }

        double subresult = _recur(x, n / 2);
        double result;

        if (n % 2 == 1) {
            result = subresult * subresult * x;
        } else {
            result = subresult * subresult;
        }

        return result;

    }
}
// @lc code=end
