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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode current = head;

        while (current != null) {
            ListNode groupStart = current;
            ListNode groupEnd = getGroupEnd(current, k);

            if (groupEnd == null) {
                break;
            }

            ListNode nextGroupStart = groupEnd.next;
            groupEnd.next = null;  // Disconnect the current group for reversal

            reverseList(groupStart);
            prevGroupEnd.next = groupEnd;
            groupStart.next = nextGroupStart;

            prevGroupEnd = groupStart;
            current = nextGroupStart;
        }

        return dummy.next;
    }

    private ListNode getGroupEnd(ListNode start, int k) {
        for (int i = 1; i < k; i++) {
            if (start == null || start.next == null) {
                return null;  // Group is not complete
            }
            start = start.next;
        }
        return start;
    }

    private void reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }
}
