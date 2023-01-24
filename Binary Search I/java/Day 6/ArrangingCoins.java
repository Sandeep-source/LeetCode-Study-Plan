class Solution {
    public int arrangeCoins(int n) {
        /***
        Perform binary search b/w 1 to n
         a) Calculate the sum from 1 to mid
         b) if sum==n then return mid
         c) if sum>mid then search in left side
         d) otherwise search in right side
         
         */
        int s=1;
        int e=n;
        while(s<=e){
            long mid=s+(e-s)/2;
            double sum=(mid*(mid+1))/2;
            if(sum==n){
                return (int)mid;
            }else if(sum>n){
                e=(int)mid-1;
            }else{
                s=(int)mid+1;
            }
        }
        return e;
    }
}