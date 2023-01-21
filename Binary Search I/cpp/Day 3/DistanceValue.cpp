class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        /*
        Still feguring out how how to apply binary search 🤔
        */
      int count=0;
      for(int i=0;i<arr1.size();i++){
          for(int j=0;j<arr2.size();j++){
              int v=arr1[i]-arr2[j];
              if(v<0){
               v=-v;
              }
              if(v<=d){
                  break;
              }
              if(j==arr2.size()-1){
                  count++;
              }
          }
      }
      return count;
    }
};