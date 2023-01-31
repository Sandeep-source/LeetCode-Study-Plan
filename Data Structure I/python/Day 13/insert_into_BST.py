# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        '''
        Approach:
         1- Perform binary tree search until root is null without returning value and storing the parent node
         2- Now if parent node is null then create a new TreeNode and return node
         3- Otherwise 
            a) If val is less than parent's val then make a new node and make it left child of parent
            b) Otherwise make a new node and make it right child of parent
         4- Return the root node
        '''
        parent=None
        ans=root
        while(root!=None):
            parent=root
            if(root.val>val):
                root=root.left
            else:
                root=root.right
        if(parent==None):
            return TreeNode(val)
        else:
            if(val>parent.val):
                parent.right=TreeNode(val)
            else:
                parent.left=TreeNode(val)
        return ans