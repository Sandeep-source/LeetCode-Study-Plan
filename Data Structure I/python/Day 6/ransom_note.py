class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        '''
        Approch:
        1- Count and store chars frequency in magazine string
        2- Iterate over the ransomNote for each char in ransomNote Check frequncy in map
           a) if frequncy is zero then return false
           b) otherwise reduce count
        3- At last return true if reach to the end 
        '''
        map={}
        for i in magazine:
            if i in map:
                map[i]+=1
            else:
                map[i]=1
        for i in ransomNote:
            if i in map and map[i]>0:
                map[i]-=1
            else:
                return False
        return True