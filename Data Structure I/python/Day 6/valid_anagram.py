class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        '''
         Same as RansomNote:
         1- Count freq in first string
         2- Iterate over second one if the freq for char in zero then return false
         3- If we reach the end return true;  
        '''
        if len(s)!=len(t):
            return False
        map={}
        for i in t:
            if i in map:
                map[i]+=1
            else:
                map[i]=1
        for i in s:
            if i in map and map[i]>0:
                map[i]-=1
            else:
                return False
        return True