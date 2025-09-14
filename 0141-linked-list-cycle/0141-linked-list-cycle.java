/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
      HashSet<ListNode> visited=new HashSet<>();
    //   if(head==null||head.next==null){
    //     return false;
    //   }
      ListNode crr=head; 
      while(crr!=null&&crr.next!=null){
        if(visited.contains(crr)){
            return true;
            
        }
          visited.add(crr);
          crr=crr.next;
      } 
      return false;

    }
}