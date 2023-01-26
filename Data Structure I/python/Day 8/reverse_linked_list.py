# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
        Approach: 
          1- Three pointer reverse, current, next. At any position in linked list they will refering to nodes like this
              O --> O --> O
              ^     ^     ^
        reverse  current next

          2- Now Assign current.next to reverse and and reverse = current and then move every pointer right 
          3- Order of these operations matters
          4- finally return reverse 
        '''
        reverse=head
        if(head==None):
            return head
        
        current=head.next
        head.next=None
        next=None
        while(current!=None):
            next=current.next
            current.next=reverse
            reverse=current
            current=next
        return reverse