class Solution {
public:
    int singleNumber(vector<int>& nums) {
         int num=0;
        for(auto i : nums){
            num=num^i;
        }
        return num;
    }
};