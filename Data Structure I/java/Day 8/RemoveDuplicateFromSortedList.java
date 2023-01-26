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
        /**
         1- Create a pointer ans and assing it to head and move head to next
         2- iterate over list if the current element is not equal to last element of ans list then add to list otherwise skip it  
         */
        ListNode ans=head;
        if(head==null){
            return null;
        }
        ListNode ansHead=ans;
        head=head.next;
        ans.next=null;
        while(head!=null){
            if(head.val!=ans.val){
                ans.next=head;
                head=head.next;
                ans=ans.next;
                ans.next=null;
            }else{
                head=head.next;
            }
            
        }
        return ansHead;
    }
}