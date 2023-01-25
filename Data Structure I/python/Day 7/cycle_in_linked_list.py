# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool

         Approach:
           1- Traverse through the list and mark them visited by assign them with minimum value possible
           2- If we encounter a node with mark as visited then tree has a cycle and return true
           3- At last return true we didn't encounter any cycle
        """
        MAX=10**5+1
        while(head!=None):
            if head.val==MAX:
                return True
            else:
                head.val=MAX
            head=head.next
        return False