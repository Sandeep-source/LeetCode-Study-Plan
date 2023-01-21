class Solution {
    public int maxProfit(int[] prices) {
        /**
        To pointer approach, similear to kadane's algo
         */
        int l=0;
        int r=1;
        int max=0;
        while(r<prices.length){
            if(prices[l]>=prices[r]){
                l=r;
            }else 
            if(prices[l]<prices[r]&&max<(prices[r]-prices[l])){
                max=prices[r]-prices[l];
            }
            r++;
        }
        return max;
    }
}