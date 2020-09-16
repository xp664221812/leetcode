import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        _recur(root);
        return ans;

    }

    private void _recur(TreeNode node) {
        if (node == null) {
            return;
        }

        _recur(node.left);
        ans.add(node.val);
        _recur(node.right);
    }

}
// @lc code=end
