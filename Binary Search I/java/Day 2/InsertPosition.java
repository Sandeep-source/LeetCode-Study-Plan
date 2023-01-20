class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
          Approach:
            1- Simply apply binary search
            2- If element found then return the index
            3- else return next index of last search position 
        */
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
}