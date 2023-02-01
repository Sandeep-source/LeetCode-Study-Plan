        ans=[]
        self.valid(root,ans)
        for i in range(len(ans)):
            if(ans[i]<=ans[i-1]):
                return false
        return true
    
    def valid(self,root,ans):
        if(root==None):
            return
        
        self.valid(root.left,ans)
        ans.append(root.val)
        self.valid(root.right,ans)

    