class Solution:
    def arrangeCoins(self, n: int) -> int:
        '''
        Perform binary search b/w 1 to n
         a) Calculate the sum from 1 to mid
         b) if sum==n then return mid
         c) if sum>mid then search in left side
         d) otherwise search in right side
        '''
        s=1
        e=n
        while(s<=e):
            mid=s+(e-s)//2
            sum=(mid*(mid+1))/2
            if(sum==n):
                return int(mid)
            elif(sum>n):
                e=mid-1
            else:
                s=mid+1
        return int(e)