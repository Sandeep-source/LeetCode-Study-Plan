class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        int size=nums1.size()>nums2.size()?nums1.size():nums2.size();
        vector<int> inter;
        int k=0;
        for(int i=0;i<nums1.size();i++){
            for(int j=0;j<nums2.size();j++){
                if(nums1[i]==nums2[j]){
                    inter.push_back(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
            }
        }
        return inter;
    }
};