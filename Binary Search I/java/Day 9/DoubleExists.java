class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        /**
        Simple bruteforce search to get pairs


        Still figuring out how to apply binary search 🤔
         */
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
              if(i!=j&&arr[i]==2*arr[j]){
                  return true;
              }
          }
      }
      return false;
    }
};