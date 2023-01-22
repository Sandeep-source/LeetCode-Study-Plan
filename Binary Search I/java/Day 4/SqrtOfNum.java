class Solution {
    public int mySqrt(int x) {
        /**
          Simply search for squreroot as we add in perfect squre question in Study plan, Binary Search I (Day 3)
          a) if Root found return root
          b) else return smaller than root which is end pointer in this case
         */
        int s=1;
        int e=x;
        while(s<=e){
            int mid=s+(e-s)/2;
            double mm=Math.pow(mid,2);
            if(mm==x){
                return mid;
            }
            if(mm>x){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return e;
    }
}