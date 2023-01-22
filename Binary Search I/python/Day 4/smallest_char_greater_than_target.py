class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        '''
         Simple binary search but don't return if value found
         a) if value found go to right
         b) at the end s will be reffering the desired char
         c) if s is out of index than return first char
        '''
        s=0
        e=len(letters)-1
        while(s<=e):
            m=s+(e-s)//2
            if(letters[m]>target):
                e=m-1
            else:
                s=m+1
        if(s>=len(letters)):
            return letters[0]
        return letters[s]