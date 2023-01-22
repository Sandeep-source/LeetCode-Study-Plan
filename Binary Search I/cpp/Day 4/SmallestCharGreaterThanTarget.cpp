class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        /**
        Simple binary search but don't return if value found
         a) if value found go to right
         b) at the end s will be reffering the desired char
         c) if s is out of index than return first char
         */
         int s=0;
        int e=letters.size()-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(letters[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        if(s>=letters.size()){
            return letters[0];
        }
        return letters[s];
    }
};