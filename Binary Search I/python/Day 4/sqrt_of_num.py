class Solution:
    def mySqrt(self, x: int) -> int:
        '''
        Simply search for squreroot as we add in perfect squre question in Study plan, Binary Search I (Day 3)
          a) if Root found return root
          b) else return smaller than root which is end pointer in this case
        '''
        s=1
        e=x
        while(s<=e):
            m=s+(e-s)//2
            mm=m*m
            if(mm==x):
                return m
            
            if(mm>x):
                e=m-1
            else:
                s=m+1
            
        
        return e
        