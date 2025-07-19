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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy,crr=head;
        while(crr!=null && crr.next!=null){
            prev.next=crr.next;
            crr.next=crr.next.next;
            prev.next.next=crr;
            prev=crr;
            crr=crr.next;
        }
       return dummy.next; 
    }
}