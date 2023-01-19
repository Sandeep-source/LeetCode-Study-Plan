class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        /* This solution follows Kanane's Algo. Proper explaination can be found here https://www.youtube.com/watch?v=HCL4_bOd3-4
         * 1. Iterate trough the array 
         * 2. Add element to sum if the sum> max then update the max
         *  and if sum<0 then ipdate sum to zero  
         * 3. Return max
        */
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
};