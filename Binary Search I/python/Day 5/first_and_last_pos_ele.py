class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        '''
        Apply binary search to times for both element
          A) In first search if we find element then store the index and move to left for any further target present in left
          B) In Second search if we find element then store the index and move to roght for any further target present in right

        Finally return these indices.
        '''
        s=0
        ans=[-1,-1]
        e=len(nums)-1
        while(s<=e):
            mid=(s+e)//2
            if nums[mid]==target:
                ans[0]=mid
                e=mid-1
            elif nums[mid]>target:
                e=mid-1
            else:
                s=mid+1
        s=0
        e=len(nums)-1
        while(s<=e):
            mid=(s+e)//2
            if nums[mid]==target:
                ans[1]=mid
                s=mid+1
            elif nums[mid]>target:
                e=mid-1
            else:
                s=mid+1
        return ans