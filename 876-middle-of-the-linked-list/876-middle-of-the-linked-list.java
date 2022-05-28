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
    public ListNode middleNode(ListNode head) {
        if(head==null)
            return head;
        ListNode fast=new ListNode(0,head),slow=fast;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast!=null) fast=fast.next;
        }
        return slow;
    }
}