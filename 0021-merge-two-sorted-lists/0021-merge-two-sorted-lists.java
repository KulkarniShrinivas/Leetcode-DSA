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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //creating dummy node

        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        //creating the copy of the node to iterate 
        ListNode headNode = returnNode;

        //traversing till one of list reaches null
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
            returnNode.next = l1;
            l1= l1.next;
        } else {
            returnNode.next = l2;
            l2 = l2.next;
        }
        returnNode = returnNode.next;
    }

    //append remaing 
    if(l1==null){
        returnNode.next = l2;
    } else if(l2==null){
            returnNode.next = l1;
        }
         return headNode.next;
    }
   
}