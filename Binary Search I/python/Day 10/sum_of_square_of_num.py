class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        '''
        Approach-> two Pointers:
          1- Start from s=0 and e=sqrt(c)
          2- If num is equal to sum of sqaure of s and e then return true
          3- If num is less than sum of sqaure of s and e then increment s
          4- Otherwise decrement e
          5- At last return false
        '''
        s=0
        e=int(sqrt(c))
        while(s<=e):
            su=s*s+e*e
            if(su==c):
                return True
            if(su>c):
                e-=1
            else:
                s+=1
        return False