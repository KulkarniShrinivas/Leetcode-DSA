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
    public static ListNode rotateRight(ListNode head, int k){
        if(k <= 0 || head == null || head.next == null){
            return head;
        }
        //find the last node and length of the list
        ListNode lastNode = head;
        //length initially 1 because we are already at head
        int length = 1;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            length++;
        }
        //point its next original head
        lastNode.next = head;
        int rotation = k % length;
        int skip = length - rotation;
        ListNode newLast = head;

        for (int i=0; i<skip-1; i++){
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}