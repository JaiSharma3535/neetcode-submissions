class Solution {
    public int maxProfit(int[] prices) {
       int l=0;
       int  r=1;
       int ans=0;
       while(r<prices.length){
        if(prices[l]<prices[r]){
        int buy=prices[l];
        int sell=prices[r];
        ans=Math.max(Math.abs(buy-sell),ans);
        }else{
            l=r;
        }
        r++;
       }
       return ans;
    }
}
