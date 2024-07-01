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
 //dry run
 //for loop going to each element till end
 //but we need to do under one iteration in efficient solution 
 //lets consider for 2 iteration
 //create dummynode and assign two pointers for them as first and second pointer 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        //[dummy]->[4]->[8]->[15]->[16]->[23]
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        //move secondPtr n spaces ahead
        for(int i =0; i<n; i++){
            secondPtr = secondPtr.next;
        }

        //move both now until the next of secondPtr is null
        while(secondPtr.next != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;

        }

        //we now have to remove the node next to firstPtr
        firstPtr.next = firstPtr.next.next;

        return dummy.next;
        
    }
}