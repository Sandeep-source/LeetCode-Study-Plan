class Solution {
public:
    int search(vector<int>& nums, int target) {
        return binSearch(nums,0,nums.size()-1,target);
    }
    int binSearch(vector<int>& num,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(num[mid]==target){
            return mid;
        }
        if(num[mid]>target){
            return binSearch(num,s,mid-1,target);
        }else{
            return binSearch(num,mid+1,e,target);
        }
    }
};