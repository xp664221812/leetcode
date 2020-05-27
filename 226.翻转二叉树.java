/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        _invertTree(root);
        return root;
    }

    public void _invertTree(TreeNode current) {
        if (current == null) {
            return;
        }
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        _invertTree(current.left);
        _invertTree(current.right);

    }

}
// @lc code=end
