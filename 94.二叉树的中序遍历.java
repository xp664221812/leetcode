import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

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

    // 非递归
    public List<Integer> inorderTraversal1(TreeNode root) {
        Stack<TreeNode> stack = new Stack();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }

        return ans;
    }

    public List<Integer> inorderTraversal3(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }




    public List<Integer> inorderTraversal4(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();

        if(root==null){
            return ans;
        }

        while(root!=null||!stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            ans.add(root.val);
            root=root.right;

        }

        }
    }

}
// @lc code=end
