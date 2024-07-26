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
    //recursive approach
    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) {
            return node; // this this becomes null we will start iterating 
        } 
        // at last we will have 5 whose next is null so wew will finally return 5 
        // now node.next is 5 so 5.next is 4 and then 4.next will be null 
        // similarly this process will continue
        ListNode newHead = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    
    // Entry point to the reversal process
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
}
