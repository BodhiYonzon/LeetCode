/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list=new ArrayList<>();
        List<Node> level=new ArrayList<>();
        if(root==null)
            return list;
        level.add(root);
        while(level.size()!=0){
            List<Node>temp=new ArrayList<>();
            List<Integer>temp2=new ArrayList<>();
            for(Node i:level){
                temp.addAll(i.children);
                temp2.add(i.val);
            }
            list.add(temp2);
            level=temp;
        }
        return list;
        
    }
}