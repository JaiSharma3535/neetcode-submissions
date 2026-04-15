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
    List<List<Integer>> li=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        level(root,0);
        return li;
    }
    private void level(TreeNode root,int d){
        if(root==null) return;
        if(d==li.size()) li.add(new ArrayList<>());
        li.get(d).add(root.val);
        level(root.left,d+1);
        level(root.right,d+1);
    }
}
