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
class BSTIterator {
    List<Integer> inorder;
    int point;

    public BSTIterator(TreeNode root) {
        this.inorder=new ArrayList<>();
        inorderTraversal(root);
        this.point=0;
    }
    void inorderTraversal(TreeNode root){
        if(root==null)
            return;
        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
        return;
    }
    
    public int next() {
        return inorder.get(point++);
    }
    
    public boolean hasNext() {
        if(point<inorder.size())
            return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */