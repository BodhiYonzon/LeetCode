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
        Map<Integer,TreeNode> map=new HashMap<>();
        clon.add(cloned);
        map.put(cloned.val,cloned);
        while(!map.containsKey(target.val)&&clon.size()>0){
            List<TreeNode> clon2=new ArrayList<>();
            for(TreeNode i:clon){
                if(i.left!=null) clon2.add(i.left);
                if(i.right!=null) clon2.add(i.right);
            }
            for(TreeNode i:clon2){
                map.put(i.val,i);
            }
            clon=clon2;
        }
        return map.getOrDefault(target.val,null);
    }
}