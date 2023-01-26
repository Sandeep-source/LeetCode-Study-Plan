class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        '''
        Approach:
          1- Traverse from right top corner
          2- if num is negative then increase count and move left
          3- if num is positive move down and add count to total count
          4- if exceede the row count then add count to total count if not already done
          5- if reach to c<0 then rest of remainig elements are negative just add then to total count by totalcount+=(count*(grid.length-r)
          6- Al last return count


          Complexity: O(m + n)

          Binary search also canbe applied but in that case complexity will be O( n + log (m) )
        '''
        count=0
        totalcount=0
        r=0
        c=len(grid[0])-1
        while(r<len(grid)):
            flag=False
            if(grid[r][c]<0):
                count+=1
                c-=1
            else:
                flag=True
                totalcount+=count
                r+=1
            if(c<0):
               totalcount+=(count*(len(grid)-r))
               break
            if(r==len(grid) and c==0 and not flag):
                totalcount+=count
        return totalcount