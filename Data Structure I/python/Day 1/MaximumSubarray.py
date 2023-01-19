class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        '''
         This solution follows Kanane's Algo. Proper explaination can be found here https://www.youtube.com/watch?v=HCL4_bOd3-4
         1. Iterate trough the array 
         2. Add element to sum if the sum> max then update the max
          and if sum<0 then ipdate sum to zero  
         3. Return max
        
        '''
        su=0
        ma=nums[0]
        for i in nums:
            su+=i
            if su>ma:
                ma=su
            if su<0:
                su=0
        return ma