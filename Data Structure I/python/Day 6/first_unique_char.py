class Solution:
    def firstUniqChar(self, s: str) -> int:
        '''
        Approach
          1- Count char frequency in s
          2- return first with count 1
        '''
        map={}
        for i in range(len(s)):
            if s[i] in map:
               map[s[i]]+=1
            else:
                map[s[i]]=1
        for i in range(len(s)):
            if(map[s[i]]==1):
                return i
        return -1; 