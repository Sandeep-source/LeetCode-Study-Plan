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
    public ListNode reverseList(ListNode head) {
        /**
        Approach: 
          1- Three pointer reverse, current, next. At any position in linked list they will refering to nodes like this
              O --> O --> O
              ^     ^     ^
        reverse  current next

          2- Now Assign current.next to reverse and and reverse = current and then move every pointer right 
          3- Order of these operations matters
          4- finally return reverse 
        
         */
        ListNode reverse=head;
        if(head==null){
            return head;
        }
        ListNode current=head.next;
        head.next=null;
        ListNode next;
        while(current!=null){
            next=current.next;
            current.next=reverse;
            reverse=current;
            current=next;
        }
        return reverse;
    }
}