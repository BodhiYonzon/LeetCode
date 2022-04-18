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
    int ans=Integer.MAX_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return ans;
    }
    int inorder(TreeNode root,int k){
        if(root==null)
            return k;
        k=inorder(root.left,k);
        k--;
        if(k==0)
            ans=root.val;
        k=inorder(root.right,k);
        return k;
    }
}