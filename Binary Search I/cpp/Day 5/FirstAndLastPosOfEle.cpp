class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        /**
         Apply binary search to times for both element
          A) In first search if we find element then store the index and move to left for any further target present in left
          B) In Second search if we find element then store the index and move to roght for any further target present in right

        Finally return these indices.
        
         */
        vector<int> res={-1,-1};
        int s=0;
        int e=nums.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                res[0]=mid;
                e=mid-1;
            }else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        s=0;
        e=nums.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                res[1]=mid;
                s=mid+1;
            }else if(nums[mid]<target) s=mid+1;
            else e=mid-1;
        }
        return res;
    }
};