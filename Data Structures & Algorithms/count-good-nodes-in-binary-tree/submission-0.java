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
    public int goodNodes(TreeNode root) {
        return node(root,root.val);
    }
    private int node(TreeNode root,int mval){
        if(root==null){
            return 0;
        }
        int ans=0;
        if(root.val>=mval){
            ans=1;
        }
        mval=Math.max(mval,root.val);
       ans+=node(root.left,mval);
       ans+=node(root.right,mval);
       return ans;
    }
}
