# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        '''
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise first call same method for left tree then add value to list  and then call for right tree;
        '''
        lst=[]
        self.inOrder(root,lst)
        return lst
    def inOrder(self,root,lst):
        if(root==None):
            return lst
        self.inOrder(root.left,lst)
        lst.append(root.val)
        self.inOrder(root.right,lst)
        return lst