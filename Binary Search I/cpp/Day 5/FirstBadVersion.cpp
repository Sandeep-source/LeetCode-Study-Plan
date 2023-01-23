// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {

        /**
         Simple binary search
           a) If is bad version is true then search on left hand to get first bad version
           b) else search on right hand to get first bad version

           at the end return s which will be reffering to first bad version 
        
         */
      int s=1;
      int e=n;
      while(s<=e){
          int mid=s+(e-s)/2;
          if(isBadVersion(mid)){
              e=mid-1;
          }else{
              s=mid+1;
          }
      }   
      return s;
    }
};