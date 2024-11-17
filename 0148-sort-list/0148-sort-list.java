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
    public ListNode sortList(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        } 

        ListNode middle  = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);

        return merge(left, right);
    }

    public static ListNode getMiddle(ListNode head){
        if(head == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(left != null && right != null){
            if(left.val > right.val){
                current.next = right;
                right = right.next;
            } else{
                current.next = left;
                left = left.next;
            }
            current = current.next;
        }

        if(left != null){
            current.next = left;
        } else{
            current.next = right;
        }
        return dummy.next;
    }
}