class Solution {
    public int specialArray(int[] nums) {
        /**
        Approach:
        1- Guess a number b/w 0 to max(nums) guess can be difficult so use binary search for this
        2- For each guess (let mid) count the number of element greater in nums greater than guess(mid)
           a) if count==guess then return guessed(mid) number
           b) if count is less then search(guess) in left side (0,mid-1)
           c) otherwise search in right side  (mid+1,e)
        3- if know number found satisfying criteria then return -1 
        
         */
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int s=0;
        int e=max;
        while(s<=e){
            int mid=s+(e-s)/2;
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=mid){
                    count++;
                }
            }
            if(count==mid){
                return mid;
            }
            if(count<mid){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}