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
     public ListNode middleNode(ListNode head){
       ListNode slowPtr = head;
       ListNode fastPtr = head;

       //travel until fast poiter reaches the last node or null
       while(fastPtr != null && fastPtr.next != null){
        //slow pointer moves 1 node
        slowPtr = slowPtr.next;

        //fast pointer moves 2 nodes
        fastPtr = fastPtr.next.next;
       }
       return slowPtr;
    }
}