class Solution {
    public int maxProfit(int[] prices) {
        int Profit =0 , bestBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > bestBuy) {
                Profit = Math.max(Profit, prices[i] - bestBuy);
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }
        return Profit;
    }
}