# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        '''
        Simple Approach:
          1- Create a recursive method
          2- If the root is null rhen return 
          3- Otherwise first call same method for left tree then call for right tree and then add value to list ;
       
        '''
        lst=[]
        self.postOrder(root,lst)
        return lst
    def postOrder(self,root,lst):
        if(root==None):
            return lst
        self.postOrder(root.left,lst)
        self.postOrder(root.right,lst)
        lst.append(root.val)
        return lst