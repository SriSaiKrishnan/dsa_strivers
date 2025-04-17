package arrays01;

/*

You are given an array of prices where prices[i] is the price of a given stock on an ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Examples
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and
sell on day 5 (price = 6), profit = 6-1 = 5.

Note: That buying on day 2 and selling on day 1
is not allowed because you must buy before
you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are
done and the max profit = 0.

 */

public class StockBuySell {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        stockBuySell1(prices);
    }

    //bruteForce
    private static void stockBuySell(int[] prices) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<prices.length; i++)
        {
            for (int j=i+1; j<prices.length; j++)
            {
                if(prices[j] > prices[i])
                {
                    sum = prices[j] - prices[i];
                    max = Math.max(sum,max);
                }
            }

        }
        System.out.println(max);
    }

    //optimal
    private static void stockBuySell1(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++)
        {
            if(prices[i]<minPrice)
                minPrice = prices[i];
            else if(prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;
        }

        System.out.println(maxProfit);

    }

}
