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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        if(head==null){
            return null;
        }
        while(current.next!=null){
            if(current.val==current.next.val){
                ListNode currentP2=current.next.next;
                current.next = currentP2;
            }else{
                current=current.next;
            }
        }
        return head;

    }
}