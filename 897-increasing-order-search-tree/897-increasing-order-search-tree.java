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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode node=root;
        while(node.left!=null)
            node=node.left;
        inorder(root,null);
        return node;
    }
    void inorder(TreeNode root,TreeNode point){
        if(root==null)
            return;
        inorder(root.left,root);
        TreeNode node=root.right;
        if(root.right!=null){
            while(root.right.left!=null)
                root.right=root.right.left;
            inorder(node,point);
        }
        else if(point!=null){
            root.right=point;
        }
        root.left=null;
        return;
    }
}