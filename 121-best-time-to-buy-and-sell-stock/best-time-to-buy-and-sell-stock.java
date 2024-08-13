class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length==1) return 0;
        int n = prices.length-1;
        
        int maxPrice = prices[n];
        int maxProfit = 0;
        
        for(int index = n;index>=0;index--){
            maxProfit = Math.max(maxProfit, maxPrice-prices[index]);
            maxPrice = Math.max(maxPrice, prices[index]); 
        }
        return maxProfit;
        
    }
}