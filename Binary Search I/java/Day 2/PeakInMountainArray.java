class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         /*
        Approach: 
          ex - [0,10,5,2]
          1- Apply Binary search. From above sxample we can figure out that if arr[i]>arr[i+1] then peak will lie in 
            first part of the array.
          2- Otherwise search second part 
          3- At the end search we will on the peak position
          4- Return the position
        */
        int s=0;
         int e=arr.length-1;
         while(s<e){
             int mid=s+(e-s)/2;
             if(arr[mid]>arr[mid+1]){
                 e=mid;
             }else{
                 s=mid+1;
             }
         }
        return s;
    }
}