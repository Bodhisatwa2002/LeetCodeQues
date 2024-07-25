/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head; //initialize fast pointer
        ListNode slow = head; //initialize slow pointer
        while (fast != null && fast.next != null) {
            fast = fast.next.next; //fast moves by two times
            slow = slow.next; //slow moves by one time
            if (fast == slow) {// if fast is equal to slow then it means there is a cycle present in linked list
                return true;
            }
        }
        return false;
    }
}