class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        /* Solution Approach - 
         *  1- Maintain a list of array element 
         *  2- iterate through array if the element is already 
         *  in the list then we found duplicate so return true otherwise 
         *  add element to the array.
         *  3- Atlast return false because we didn't find any duplicate
         *  elements. 
         * 
        */
        unordered_set<int> set;
        for (int i = 0; i < nums.size(); i++) {
            if (set.find(nums[i]) != set.end()) {
                return true;
            }
            set.insert(nums[i]);
        }
        return false;
        }
};