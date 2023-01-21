class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        /**
         Still feguring out how how to apply binary search 🤔
         */
      int count=0;
      for(int i=0;i<arr1.length;i++){
          for(int j=0;j<arr2.length;j++){
              int v=Math.abs(arr1[i]-arr2[j]);
              if(v<=d){
                  break;
              }
              if(j==arr2.length-1){
                  count++;
              }
          }
      }
      return count;
    }
}