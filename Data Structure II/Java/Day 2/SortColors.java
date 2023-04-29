class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int min=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[min])
                min=j;
            }
            if(min!=i){
                int temp=nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
        }
    }
}