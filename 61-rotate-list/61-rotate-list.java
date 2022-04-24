/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)  return head;
        ListNode node=head;int l=1;
        while(node.next!=null){
            node=node.next;
            l++;
        }
        k%=l;
        if(k==0)
            return head;
        node.next=head;
        k=l-k;
        while(k-->0){
            node=node.next;
        }
        head=node.next;
        node.next=null;
        return head;
    }
}