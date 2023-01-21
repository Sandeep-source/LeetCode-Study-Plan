class Solution {
public:
    bool isPerfectSquare(int num) {
         /**
          Approach:
            1- Perform binary search b/w 1 to num
            2- if square of mid number is equal to num then return true
            3- if square of mid term in greater than the number then search in left side otherwise in right side
            4- if number sqrt not found then return false 
         */
        int s=1;
        int e=num;
        if(num==1) return true;
        while(s<=e){
            long m=s+(e-s)/2;
            double mm=m*m;
            if(mm==num){
                return true;
            }
            if(mm>num){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return false;
    }
};