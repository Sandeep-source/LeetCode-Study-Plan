# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        '''
        Approach:
        1- If root is None then return Return None
        2- Otherwise swap the children
        3- Call this function recursively for both children. This will do swap for all node in tree at last we will get inverted tree
        4- return the root
        '''
        if(root==None):
            return None
        root.left,root.right=root.right,root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root