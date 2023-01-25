/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
         /**
         Approach:
           1- Traverse through the list and mark them visited by assign them with minimum value possible
           2- If we encounter a node with mark as visited then tree has a cycle and return true
           3- At last return true we didn't encounter any cycle
         */
        while(head!=NULL){
            if(head->val==INT_MIN){
                return true;
            }else{
              head->val=INT_MIN;
           }
           head=head->next;
        }
        return false;
    }
};