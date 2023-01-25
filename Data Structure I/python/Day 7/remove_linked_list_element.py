# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        while(head!=None and head.val==val):
            head=head.next
        temp=head
        ans=temp
        if(head!=None):
            head=head.next
        while(head!=None):
            if(head.val!=val):
                temp.next=head
                temp=temp.next
            elif(head.next==None):
                temp.next=None
            head=head.next
        return ans