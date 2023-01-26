class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
         /**
        Approach:
          1- Traverse from right top corner
          2- if num is negative then increase count and move left
          3- if num is positive move down and add count to total count
          4- if exceede the row count then add count to total count if not already done
          5- if reach to c<0 then rest of remainig elements are negative just add then to total count by totalcount+=(count*(grid.length-r)
          6- Al last return count


          Complexity: O(m + n)

          Binary search also canbe applied but in that case complexity will be O( n + log (m) )
        
         */
        int count=0;
        int totalcount=0;
        int r=0;
        int c=grid[0].size()-1;
        while(r<grid.size()){
            bool flag=false;
            if(grid[r][c]<0){
                count++;
                c--;
            }else{
                flag=true;
                totalcount+=count;
                r++;
            }
            if(c<0){
               totalcount+=(count*(grid.size()-r));
               break;
            }
            if(r==grid.size()&&c==0&&!flag){
                totalcount+=count;
            }
        }
        return totalcount;
    }
};