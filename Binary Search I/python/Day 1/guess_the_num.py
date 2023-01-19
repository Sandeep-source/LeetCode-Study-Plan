# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        '''
        Simple binary search pick the middle of 1 to n.
        Here we don't have any target number to compare but we have a function guess() 
        which do the same thing as comparison 
         *   -1: Number is big search in left side
         *    1: Number is small search in right side
         *    0: You found the element return that
          
         '''
        s=1
        e=n
        while(s<=e):
            m=(s+e)//2
            g=guess(m)
            if g==0:
                return m
            if g<0:
                e=m-1
            else:
                s=m+1
        return 1