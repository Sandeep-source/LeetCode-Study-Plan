# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        '''
        Approach:
         1- Create a current list and add root to list
         2- Create a recursive function and call the functions with current list and ans list. This fun do the following
            a) If current list is null then retun 
            a) For each element in the list add the value to a temporaryAns list and their child (Element of new level)  to a temporaryCurrent list
            b) Now add new temporaryAns list to ansList and call recursive function with new temporaryCurrent(new Level) list 
         3- At last return the ans returned by the the recursive function

        '''
        ans=[]
        current=[]
        current.append(root)
        self.traverse(current,ans)
        return ans
    
    def traverse(self,current,ans):
        if(len(current)==0):
            return
        
        tempAns=[]
        temp=[]
        for node in current:
                if(node==None):
                    return
                tempAns.append(node.val)
                if(node.left!=None):
                    temp.append(node.left)
                
                if(node.right!=None):
                    temp.append(node.right)
        ans.append(tempAns)
        self.traverse(temp,ans)