class Solution {
public:
    int findMin(vector<int>& nums) {
        /**
        Approach:
        1- Perform Binary Search
        2- if the mid element is greter then equal to start and end then small element will be in right hand side
           so search in right hand side
        3- Otherwise search in left hand side of array 
        4- At the end nums[end] will be refering to the smallest element in the list so return that
        */
        int s=0;
        int e=nums.size()-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>=nums[s]&&nums[mid]>=nums[e]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        return nums[e];
    }
};