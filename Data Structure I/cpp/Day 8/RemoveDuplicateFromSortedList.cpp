/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        /*
         1- Create a pointer ans and assing it to head and move head to next
         2- iterate over list if the current element is not equal to last element of ans list then add to list otherwise skip it  
         */
       ListNode* ans=head;
        if(head==NULL){
            return NULL;
        }
        ListNode* ansHead=ans;
        head=head->next;
        ans->next=NULL;
        while(head!=NULL){
            if(head->val!=ans->val){
                ans->next=head;
                head=head->next;
                ans=ans->next;
                ans->next=NULL;
            }else{
                head=head->next;
            }
            
        }
        return ansHead; 
    }
};