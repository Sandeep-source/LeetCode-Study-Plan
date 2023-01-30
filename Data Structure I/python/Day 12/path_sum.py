# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        '''
        Approach:
        1- Create a recursive function and call with root and current sum as 0
        2- The function will do following
           a) If root is null then return false
           b) Otherwise add value of root to current sum
           c) If both of the childs are null it means we are at the leaf now if the current sum is equal to th target then we
              found the answer just return it.
           d) Otherwise call the same function for both child passing the current sum
        3- At the last return whatever returned by the Function
           
        '''
        
        return self.check(root,0,targetSum)
    
    def check(self,root,current,targetSum):
        if(root==None):
            return False
        current+=root.val
        if(root.left==None and root.right==None and current==targetSum):
            return True
        return self.check(root.left,current,targetSum) or self.check(root.right,current,targetSum)