# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        '''
        Approach:
         1- Create a recursive function and call the function with root and intitially depth value as zero
         2- The Recursive function will do the following 
            a) If the root is null return the current depth value
            b) Otherwise call same function for both child by adding 1 to the depth
            c) At the end return the maximum of both values returned by the recursive function calls
         3- At the last return whaterver the recursive function returned to you
        '''
        return self.maxD(root,0)
    
    def maxD(self,root,val):
        if(root==None):
            return val
        a=self.maxD(root.left,val+1)
        b=self.maxD(root.right,val+1)
        return a if a>b else b