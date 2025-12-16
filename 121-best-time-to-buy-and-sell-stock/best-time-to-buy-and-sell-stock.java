class Solution {
    public int maxProfit(int[] prices) {
        int curr=0;
        int best=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-prices[i-1];
            curr=Math.max(diff,curr+diff);
            best=Math.max(best,curr);
        }
        return best;
    }
}