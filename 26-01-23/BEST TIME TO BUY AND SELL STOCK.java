/* 10)BEST TIME TO BUY AND SELL STOCK 

SOLUTION IN JAVA */

class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int p=0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                p=Math.max(p,prices[r]-prices[l]);
            }
            else{
                l=r;
            }
            r++;
        }
        return p;
    }
}
