class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        /*
         Approch:
          1- Create ArrayList with `numRows` rows, each having 1,2,3,..,numRows columns
          2- Reverse through this new list
          3- Set first and last column of rows to 1, For other column take same column of preivous row and its preceeding num 
              add them and set as current value
          4- Finnaly return the answer
        */
        vector<vector<int>> ans;
        for(int i=0;i<numRows;i++){
            vector<int> temp(i+1,1);
            for(int j=1;j<i;j++){
                     temp[j]=(ans[i-1][j]+ans[i-1][j-1]);
                  
            }
            ans.push_back(temp);
        }
        return ans;
    }
};