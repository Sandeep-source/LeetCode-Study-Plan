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
    ListNode* reverseList(ListNode* head) {
        /*
         Approach: 
          1- Three pointer reverse, current, next. At any position in linked list they will refering to nodes like this
              O --> O --> O
              ^     ^     ^
        reverse  current next

          2- Now Assign current.next to reverse and and reverse = current and then move every pointer right 
          3- Order of these operations matters
          4- finally return reverse 
        
        */
        ListNode* reverse=head;
        if(head==NULL){
            return head;
        }
        ListNode* current=head->next;
        head->next=NULL;
        ListNode* next;
        while(current!=NULL){
            next=current->next;
            current->next=reverse;
            reverse=current;
            current=next;
        }
        return reverse;
    }
};