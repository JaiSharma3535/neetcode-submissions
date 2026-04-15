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
    List<Integer> li;
    public List<Integer> postorderTraversal(TreeNode root) {
         li=new ArrayList<>();
        post(root);
        return li;
    }
    private void post(TreeNode root){
        if(root==null){
            return;
        }
        
        post(root.left);
        post(root.right);
        li.add(root.val);
    }
}