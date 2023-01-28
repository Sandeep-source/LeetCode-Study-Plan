class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int size=nums1.length>nums2.length?nums1.length:nums2.length;
        int[] inter= new int[size];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    inter[k++]=nums1[i];
                    nums2[j]=-1;
                    break;
                }
            }
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=inter[i];
        } 
        return ans;
    }
}