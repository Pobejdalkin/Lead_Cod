public class _122BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {

        int[] prices = {7};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int lowest = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (lowest > prices[i]) {
                lowest = prices[i];
            }
            if (i==prices.length-1||prices[i]>prices[i+1]){
                profit+=prices[i]-lowest;
                lowest = prices[i];
            }
        }
        return profit;

    }
}
