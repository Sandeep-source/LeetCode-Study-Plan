class Solution {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        /**
         1- Create an array of R*C size
         2- Traverse through mat and add element to new Array and increase column by 1, when it become equal to c then change row
         3- if rowcount of new array exceede r then return mat;
         4- At last if element count in new array is eqaul to R*C then return ans else return original mat
         */
        vector<vector<int>> ans;
        int ic=0;
        int ir=0;
        int ele_count=0;
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat[i].size();j++){
                if(j==0&&i==0){
                    vector<int> temp;
                    ans.push_back(temp);
                }
                if(ir>=r){
                    return mat;
                }
                ans[ir].push_back(mat[i][j]);
                ic++;
                ele_count++;
                if(ic>=c){
                    ir++;
                    ic=0;
                    if(ir<r&&ele_count<(r*c)){
                        vector<int> temp2;
                        ans.push_back(temp2);
                    }
                    
                }
            }
        }
        if(ele_count==(r*c))
        return ans;
        return mat;
    }
};