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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev= null;
        ListNode pres=head;
        ListNode next= pres.next;

        while(pres!=null){
            pres.next=prev;//5 pointing toward null
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;// at the end the next pointer will be removed and only prev and pres will move forward
                // thus only 2
            }
        }
        return prev;
    }
}