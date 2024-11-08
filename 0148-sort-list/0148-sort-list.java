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
          if (head == null || head.next == null){
            return head;
        }

        ListNode middle = getMiddle(head);
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
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    public static ListNode merge(ListNode left, ListNode right){
        //will take dummy node because we don't know the head of the list

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if(left != null){
            temp.next = left;
        }

        if(right != null){
            temp.next = right;
        }

        return dummy.next;
    }
}