class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        /**
        Simple bruteforce search to get pairs
        Still figuring out how to apply binary search 🤔
         */
        for(int i=0;i<arr.size();i++){
          for(int j=0;j<arr.size();j++){
              if(i!=j&&arr[i]==2*arr[j]){
                  return true;
              }
          }
      }
      return false;
    }
};