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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp;
        while(head!=null&&head.val==val){
            head=head.next;
        }
        temp=head;
        ListNode ans=temp;
        if(head!=null){
            head=head.next;
        }
        while(head!=null){
            if(head.val!=val){
                temp.next=head;
                temp=temp.next;
            }else if(head.next==null){
                temp.next=null;
            }
            head=head.next;
        }
        return ans;
    }
}