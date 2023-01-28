# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        '''
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise add value to list then first call same method for left tree and then for right tree;
       
        '''
        lst=[]
        self.preOrder(root,lst)
        return lst
    def preOrder(self,root,lst):
        if(root==None):
            return lst
        lst.append(root.val)
        self.preOrder(root.left,lst)
        self.preOrder(root.right,lst)
        return lst