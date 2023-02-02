        l=0
        r=0
        su=0
        mi=len(nums)+1
        while(r<len(nums) and l<len(nums)):
            su+=nums[r]
            while(su>=target):
                if(mi>=(r-l+1)):
                    mi=(r-l+1)
                su-=nums[l]
                l+=1
            r+=1
        return 0 if mi>len(nums) else mi