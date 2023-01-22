class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        /**
         1- Create an array of R*C size
         2- Traverse through mat and add element to new Array and increase column by 1, when it become equal to c then change row
         3- if rowcount of new array exceede r then return mat;
         4- At last if element count in new array is eqaul to R*C then return ans else return original mat
         */
        int[][] ans=new int[r][c];
        int ic=0;
        int ir=0;
        int ele_count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(ir>=r){
                    return mat;
                }
                ans[ir][ic]=mat[i][j];
                ic++;
                ele_count++;
                if(ic>=c){
                    ir++;
                    ic=0;
                }
            }
        }
        if(ele_count==(r*c))
        return ans;
        return mat;
    }
}