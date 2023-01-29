class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        /**
        Approach:
         1- For each element in nums1 perform binary search in nums2
         2- If nums1[i]==nums2[mid] then store distance ( mid-i ) if it greater than current max distance and
          search in right hand side for any further posibility by assign s=mid+1
         3- Else search in left hand side left hand side by assigning e=mid-1
         */
     int max=0;
     for(int i=0;i<nums1.length;i++){
         int s=i;
         int e=nums2.length-1;
         while(s<=e){
             int mid=s+(e-s)/2;
             if(nums1[i]<=nums2[mid]){
                 if(mid-i>max){
                     max=mid-i;
                 }
                 s=mid+1;
             }else{
                 e=mid-1;
             }

         }
     }
     return max;


    }
}