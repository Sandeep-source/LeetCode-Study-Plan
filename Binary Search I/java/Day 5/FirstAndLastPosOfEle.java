class Solution {
    public int[] searchRange(int[] arr, int target) {
        /**
         Apply binary search to times for both element
          A) In first search if we find element then store the index and move to left for any further target present in left
          B) In Second search if we find element then store the index and move to roght for any further target present in right

        Finally return these indices.
        
         */
        if(arr==null) return new int[]{-1,-1};
        int s=0;
        int e=arr.length-1;
        int res[]={-1,-1};
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                res[0]=mid;
                e=mid-1;
            }else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        s=0;
        e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                res[1]=mid;
                s=mid+1;
            }else if(arr[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return res;

    }
}