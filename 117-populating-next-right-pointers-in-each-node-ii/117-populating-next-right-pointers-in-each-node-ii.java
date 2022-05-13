/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        List<Node> list=new ArrayList<>();
        list.add(root);
        while(list.size()!=0){
            List<Node> list2=new ArrayList<>();
            for(Node i:list){
                if(i.left!=null)    list2.add(i.left);
                if(i.right!=null)   list2.add(i.right);
            }
            for(int i=0;i<list2.size()-1;i++){
                list2.get(i).next=list2.get(i+1);
            }
            list=list2;
        }
        return root;
    }
}