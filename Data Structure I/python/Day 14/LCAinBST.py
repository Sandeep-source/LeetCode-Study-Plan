# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
         if(root==None):
             return None
         
         mi=q.val if p.val>q.val else p.val
         ma=p.val if p.val>q.val else q.val
         if(root.val<mi):
             return self.lowestCommonAncestor(root.right,p,q)
         
         if(root.val>ma):
             return self.lowestCommonAncestor(root.left,p,q)
         
         if(self.search(root,p.val) and self.search(root,q.val)):
             return root
         
         a=self.lowestCommonAncestor(root.left,p,q)
         b=self.lowestCommonAncestor(root.right,p,q)
         if(a==None):
             return b
         
         if(b==None):
             return a
         
         if(a.val<b.val):
             return a
         else:
             return b
         

    
    def search(self, root, val):
        if(root==None):
            return False
        
        if(root.val==val):
            return True
        
        if(root.val>val):
            return self.search(root.left,val)
        else:
             return self.search(root.right,val)
        