/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {
    List<Integer>  arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {

        dfs(root);
        return arr.get(k - 1);
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs(node.left);
        arr.add(node.val);
        dfs(node.right);
    }
}