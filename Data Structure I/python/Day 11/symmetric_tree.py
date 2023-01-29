# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        '''
        Approach:
        1- If root is null return true means no node then tree is symmetric
        2- Create a recursive function and pass left and right child to fun 
           a) If both child are null then return true
           b) If one of them are null then return false they sould be same to be summetric
           c) If key are same then call check of tree are symmetric till this label now recirively call this fun two times
              I) With left child of right subtree and right child of left subtree because they mirror ecah other so they will be
                compared for equality 
              II) With left child of left subtree and right child of right subtree because they mirror ecah other so they will be
                compared for equality
           d) At last return false this line will not be executed if one one the above had already ran
        3) retun whatever returned by the recursive functions
        '''
        if(root==None):
            return true
        return self.isSym(root.left,root.right)
    
    def isSym(self,left,right):
        
        if(left==None and right==None):
            return True
        
        if(left==None or right==None):
            return False
        
        if(left.val==right.val):
            return self.isSym(left.right,right.left)  and  self.isSym(right.right,left.left)
        
        return False