class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        lst=[]
        size=len(nums)
        nums.sort()
        for i in range(size):
            j=i+1
            k=size-1
            while j<k:
                if((nums[i]+nums[j]+nums[k])==0) and [nums[i],nums[j],nums[k]] not in lst:
                    lst.append([nums[i],nums[j],nums[k]])
                elif (nums[i]+nums[j]+nums[k])<0:
                    j+=1
                else:
                   k-=1
        return lst
                    
                    
        