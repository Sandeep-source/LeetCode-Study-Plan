class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    
        int temp[nums1.size()];
        int i=0,j=0,k=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                temp[k++]=nums1[i++];
            }else{
                temp[k++]=nums2[j++];
            }
        }
        while(i<m){
             temp[k++]=nums1[i++];
        }
        while(j<n){
            temp[k++]=nums2[j++];
        }
        k=0;
        while(k<nums1.size()){
            nums1[k]=temp[k];
            k++;
        }
    }
};