class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No profit can be made with less than 2 days
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Add the profit for every upward price movement
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}
