class Solution {
    public int search(int[] arr, int target) {
        /*
        Approach:
        1- The array to rotated it means it has two sorted half
        2- Perform binary search 
        3- If nums[mid]<nums[e] then we are in second sorted half 
           a) If target num is between nums[e] and nums[mid] then search in right hand side by assigning s=mid+1
           b) Else search in left hand side by assigning e=mid-1
        4- Else we are in first sorted array 
           a) If target is between nums[s] and nums[mid] then search in left hand side by assigning e=mid-1
           b) Else search in right hand side by assigning s=mid+1
        */
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<arr[e]){
                 if(target<=arr[e]&&target>arr[mid]){
                     s=mid+1;
                 }else{
                     e=mid-1;
                 }
            }else{
                  if(target>=arr[s]&&target<arr[mid]){
                      e=mid-1;
                  }
                  else{
                      s=mid+1;
                  }
            }
        }
        return -1;
    }
    
}