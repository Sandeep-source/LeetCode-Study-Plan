 int l=0;
        int r=0;
        int sum=0;
        int min=nums.size()+1;
        while(r<nums.size()&&l<nums.size()){
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
        return min>nums.size()?0:min;