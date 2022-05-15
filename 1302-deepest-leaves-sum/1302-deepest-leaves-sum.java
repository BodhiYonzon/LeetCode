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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        List<TreeNode> list,list2=new ArrayList<>();
        list2.add(root);
        do{
            list=list2;
            list2=new ArrayList<>();
            for(TreeNode i:list){
                if(i.left!=null)
                    list2.add(i.left);
                if(i.right!=null)
                    list2.add(i.right);
            }
        }
        while(list2.size()!=0);
        int ans=0;
        for(TreeNode i:list){
            ans+=i.val;
        }
        return ans;
    }
}