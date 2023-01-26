# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        '''
         1- Create a pointer ans and assing it to head and move head to next
         2- iterate over list if the current element is not equal to last element of ans list then add to list otherwise skip it  
        '''
        ans=head
        if(head is None):
            return None
        ansHead=ans
        head=head.next
        ans.next=None
        while(head is not None):
            if(head.val!=ans.val):
                ans.next=head
                head=head.next
                ans=ans.next
                ans.next=None
            else:
                head=head.next
        return ansHead