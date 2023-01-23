# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        '''
        Simple binary search
           a) If is bad version is true then search on left hand to get first bad version
           b) else search on right hand to get first bad version

           at the end return s which will be reffering to first bad version 
        '''
        s=1
        e=n
        while(s<=e):
            m=s+(e-s)//2
            if(isBadVersion(m)):
                e=m-1
            else:
                s=m+1
        return s