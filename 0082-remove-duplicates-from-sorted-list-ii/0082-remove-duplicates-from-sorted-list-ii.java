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
       if(head == null || head.next==null){
        return head;
       }
       //Dummy node to handle cases where head might be removed
       ListNode dummy=new ListNode(0);
       dummy.next = head;
       ListNode prev = dummy;
       ListNode current = head;

       while(current != null && current.next !=null){
        if(current.val == current.next.val){
            while(current.next != null && current.val == current.next.val){
                current = current.next;
            }
            //move one step further
            current = current.next;
            prev.next = current;
        } else{
            prev = current;
            current = current.next;
        }
       
       }
        return dummy.next;
        
    } 
}