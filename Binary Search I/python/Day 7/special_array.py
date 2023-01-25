class Solution:
    def specialArray(self, nums: List[int]) -> int:
        '''
        Approach:
        1- Guess a number b/w 0 to max(nums) guess can be difficult so use binary search for this
        2- For each guess (let mid) count the number of element greater in nums greater than guess(mid)
           a) if count==guess then return guessed(mid) number
           b) if count is less then search(guess) in left side (0,mid-1)
           c) otherwise search in right side  (mid+1,e)
        3- if know number found satisfying criteria then return -1 
        '''
        max=-1
        for i in nums:
            if(i>max):
                max=i
        s=0
        e=max
        while(s<=e):
            mid=s+(e-s)//2
            count=0
            for j in nums:
                if(j>=mid):
                    count+=1
            if(count==mid):
                return mid
            if(count<mid):
                e=mid-1
            else:
                s=mid+1
        return -1