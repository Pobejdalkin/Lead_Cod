public class _121BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int biggest = prices[0];
        int lowest = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (biggest < prices[i]) {
                biggest = prices[i];
            }
            if (lowest > prices[i]) {
                lowest = prices[i];
                biggest = prices[i];
            }
            if (biggest-lowest>profit){
                profit = biggest-lowest;
            }

        }
        return profit;
    }
}
