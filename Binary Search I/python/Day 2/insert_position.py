class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        '''
            Approach:
            1- Simply apply binary search
            2- If element found then return the index
            3- else return next index of last search position 
        '''
        s=0
        e=len(nums)-1
        while(s<=e):
            mid=(s+e)//2
            if nums[mid]==target:
                return mid
            if nums[mid]>target:
                e=mid-1
            else:
                s=mid+1
        return s