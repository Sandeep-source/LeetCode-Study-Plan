
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
        Approch:
          1- Perform binary search on last column to know which row may contain the value
          2- Perform binary search on that row

        
         */
      int s=0;
      int e=matrix.length-1;
      while(s<=e){
          int mid=s+(e-s)/2;
          if(matrix[mid][matrix[mid].length-1]==target){
              return true;
          }
          if(matrix[mid][matrix[mid].length-1]>target){
              e=mid-1;
          }else{
              s=mid+1;
          }
      }
      int r=s;
      if(r>=matrix.length){
          return false;
      }
      s=0;
      e=matrix[r].length-1;
      while(s<=e){
          int mid=s+(e-s)/2;
          if(matrix[r][mid]==target){
              return true;
          }
          if(matrix[r][mid]>target){
              e=mid-1;
          }else{
              s=mid+1;
          }
      }
      return false;

    }
}