/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        List<TreeNode> clon=new ArrayList<>();
        clon.add(cloned);
        while(clon.size()>0){
            List<TreeNode> clon2=new ArrayList<>();
            for(TreeNode i:clon){
                if(i.val==target.val) return i;
                if(i.left!=null) clon2.add(i.left);
                if(i.right!=null) clon2.add(i.right);
            }
            clon=clon2;
        }
        return null;
    }
}