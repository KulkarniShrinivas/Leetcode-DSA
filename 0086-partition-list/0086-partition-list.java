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
    public ListNode partition(ListNode head, int x) {
        ListNode lessThanX = new ListNode((0));
        ListNode greaterThanX = new ListNode((0));

        ListNode lessThanXHead = lessThanX;
        ListNode greaterThanXHead = greaterThanX;

        while(head != null){
            if(head.val < x){
                lessThanX.next = head;
                lessThanX = lessThanX.next;
            } else{
                greaterThanX.next = head;
                greaterThanX = greaterThanX.next;
            }

            head = head.next;
        }

         greaterThanX.next = null;
        lessThanX.next = greaterThanXHead.next;


        return lessThanXHead.next;
        
    }
}