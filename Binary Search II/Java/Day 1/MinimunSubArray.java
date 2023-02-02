class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int min=nums.length+1;
        while(r<nums.length&&l<nums.length){
            sum+=nums[r];
            while(sum>=target){
                if(min>=(r-l+1)){
                    min=(r-l+1);
                }
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return min>nums.length?0:min;
    }
}