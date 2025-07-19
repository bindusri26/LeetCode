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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head,crr;
        if(l1==null&&l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val){
            head=l1;
            l1=l1.next;
        }else{
            head=l2;
            l2=l2.next;
        }
        crr=head;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                crr.next=l2;
                l2=l2.next;

            }else{
                crr.next=l1;
                l1=l1.next;
            }
            crr=crr.next;
           
        }
        if(l1!=null){
            crr.next=l1;
        }else{
            crr.next= l2;
        }
       return head; 
    }
}