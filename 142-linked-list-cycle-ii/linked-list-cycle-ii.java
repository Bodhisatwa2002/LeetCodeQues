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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast= head;
        ListNode slow = head;
        while(fast!=null && fast.next!= null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){ //here fast and slow are at same point
                ListNode p2 = head;// we will start another pointer from starting
                while(p2!=slow){
                    p2=p2.next;//move it by one step
                    slow=slow.next;// move it by one step
                }
                return slow; // we will get where the cycle started
            }
        }
        return null;
    }
}
