import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */

// @lc code=start

//Definition for a binary tree node. 

class Solution {

    List<List<Integer>> result = new LinkedList<>();

    LinkedList<TreeNode> nodes = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        nodes.add(root);
        while (nodes.size() > 0) {
            List<Integer> temp = new LinkedList<>();
            int size=nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.remove();
                temp.add(node.val);
                if (node.left != null) {
                    nodes.add(node.left);
                }

                if (node.right != null) {
                    nodes.add(node.right);
                }

            }
            result.add(temp);

        }

        return result;

    }

    //递归写法
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        bfs(0, res, root);

        return res;

    }


    private void bfs(int index,List<List<Integer>> res,TreeNode node){
        if(index>=res.size()){
            res.add(new ArrayList<Integer>());
        }
        res.get(index).add(node.val);

        if(node.left!=null){
            bfs(index+1, res, node.left);
        }

        if(node.right!=null){
            bfs(index+1, res, node.right);
        }


    }



}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
// @lc code=end
