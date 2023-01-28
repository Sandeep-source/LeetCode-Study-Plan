class Solution {
    public boolean judgeSquareSum(int c) {
        /**
        Approach-> two Pointers:
          1- Start from s=0 and e=sqrt(c)
          2- If num is equal to sum of sqaure of s and e then return true
          3- If num is less than sum of sqaure of s and e then increment s
          4- Otherwise decrement e
          5- At last return false
         */
        long s=0;
        long e=(long)Math.sqrt(c);
        while(s<=e){
            long sum=s*s+e*e;
            if(sum==c){
                return true;
            }
            if(sum>c){
                e--;
            }else{
                s++;
            }

        }
        return false;
    }
}