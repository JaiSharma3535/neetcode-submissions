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

class Solution {
    List<Integer> li = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        view(root, 0);
        return li;
    }
    private void view(TreeNode node, int d) {
        if (node==null) return;
        if (d==li.size())
         li.add(node.val);
        view(node.right, d+1);
        view(node.left, d+1);
    }
}
