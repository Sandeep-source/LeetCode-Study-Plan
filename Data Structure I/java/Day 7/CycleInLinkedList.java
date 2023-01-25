/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /**
         Approach:
           1- Traverse through the list and mark them visited by assign them with minimum value possible
           2- If we encounter a node with mark as visited then tree has a cycle and return true
           3- At last return true we didn't encounter any cycle
         */
        while(head!=null){
            if(head.val==Integer.MIN_VALUE){
                return true;
            }else{
              head.val=Integer.MIN_VALUE;
           }
           head=head.next;
        }
        return false;
    }
}