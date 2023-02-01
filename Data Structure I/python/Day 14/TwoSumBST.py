# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        lst=[]
        self.has(root,lst)
        s=0
        e=len(lst)-1
        while(s<e):
            sum=lst[s]+lst[e]
            if(sum==k):
                return True
            
            if(sum>k):
                e-=1
            else:
                s+=1
        return False

    
    def has(self,root,lst):
         if(root==None):
             return
         
         self.has(root.left,lst)
         lst.append(root.val)
         self.has(root.right,lst)