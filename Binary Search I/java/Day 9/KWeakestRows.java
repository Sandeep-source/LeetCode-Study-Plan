class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        /**
        Approach:
          1- For each element do the following
          2- Apply binary search on each rows to find number of elements
                a) if mid is zero then search in left half
                b) else search if right half (Note: Don't return anything)
                c) at the end s will refering to index with first element with value to which is equal to numbers of 1 (Due to zero based indexing) 
          3- Store the count and their corresponding index in arr in proper place. This should maintain acsending oder of strength
          4- At the end return ans array. 
         */
        int[] ans=new int[k];
        int[] ansCount=new int[k];
        for(int i=0;i<k;i++){
            ansCount[i]=200;
        }
        for(int i=0;i<mat.length;i++){
              int s=0;
              int e=mat[i].length-1;
              while(s<=e){
                  int mid=s+(e-s)/2;
                  if(mat[i][mid]==1){
                      s=mid+1;
                  }else{
                      e=mid-1;
                     }
             
                }
              int idx=k-2;
              while(idx>=0&&ansCount[idx]>s){
                  ansCount[idx+1]=ansCount[idx];
                  ans[idx+1]=ans[idx];
                  idx--;
              }
              if(ansCount[idx+1]>=s&&ansCount[idx+1]!=s){
                ans[idx+1]=i;
                ansCount[idx+1]=s;
              }
                  

        }
        
        return ans;
    }
}