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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* temp;
        while(head!=NULL&&head->val==val){
            head=head->next;
        }
        temp=head;
        ListNode* ans=temp;
        if(head!=NULL){
            head=head->next;
        }
        while(head!=NULL){
            if(head->val!=val){
                temp->next=head;
                temp=temp->next;
            }else if(head->next==NULL){
                temp->next=NULL;
            }
            head=head->next;
        }
        return ans;
    }
};