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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head; 
        for (int i = 0; i < n - 1; i ++) {
            fast = fast.next;
        }
        
        ListNode slow = head;
        ListNode prev = null;
        while (fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        
        if (prev == null) {//Corner case : when we need to remove the 1st node
            head = head.next;
        } else {
            prev.next = slow.next;
        }
        return head;
    }
}