class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        '''
        To pointer approach, similear to kadane's algo
        '''
        l=0
        r=1
        max=0
        while(r<len(prices)):
            if(prices[l]>=prices[r]):
                l=r
            if(prices[l]<prices[r]  and max<(prices[r]-prices[l])):
                max=prices[r]-prices[l]
            r+=1
        return max