class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        '''
        Approach:
            1- Perform binary search b/w 1 to num
            2- if square of mid number is equal to num then return true
            3- if square of mid term in greater than the number then search in left side otherwise in right side
            4- if number sqrt not found then return false 
        '''
        s=1
        e=num
        if(num==1):
             return True
        while(s<=e):
            m=s+(e-s)//2
            mm=m*m
            if(mm==num):
                return True
            
            if(mm>num):
                e=m-1
            else:
                s=m+1
            
        
        return False
    