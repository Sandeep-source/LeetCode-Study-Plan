class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        '''
        Approach:
          1- Perform binary search 
          2- If the mid element is less than mid+1+k then eaither element is at proper place or there is less than k missing
            element before this then search right hand side
          3- otherwise search in left hand side
          4- At the end we will be at the position (Reffered by e or s-1) before which the number of missing element are k. So how to get that now consider
             a) at this position the number should be e+1 but kth number is missing before this then the num should be e+1+k or s+k
   
        
        
        '''
        s=0
        e=len(arr)-1
        while(s<=e):
            mid=s+(e-s)//2
            if(arr[mid]<mid+1+k):
                s=mid+1
            else:
                e=mid-1
        return s+k