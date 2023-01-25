class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /**
        Approach:
          1- Take two pinter approach 
          2- if sum of both locations in equal to target then retun them
          3- if sum is less then num then move left pointer to one step ahead
          4- if sum is greater than target then move right pointer one step before
          5- At last return -1 if not found 
         */
        int s=0;
        int e=numbers.length-1;
        while(s<e){
           if(numbers[s]+numbers[e]==target){
               return new int[]{s+1,e+1};
           }
           if(numbers[s]+numbers[e]>target){
               e--;
           }else{
               s++;
           }
        }
        return new int[]{-1,-1};
    }
}