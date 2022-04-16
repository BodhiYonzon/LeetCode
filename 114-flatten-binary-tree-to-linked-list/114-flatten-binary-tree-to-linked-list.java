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
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.left);
        TreeNode node=root.left;
        if(node!=null){
            while(node.right!=null)
                node=node.right;
            node.right=root.right;
            root.right=root.left;
            root.left=null;
        }
        if(node==null) flatten(root.right);
        else flatten(node.right);
        return;
    }
}