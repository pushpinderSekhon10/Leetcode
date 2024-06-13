package SlidingWindow;

public class BestTimeToBuyAndSellStock
{
    public int maxProfit(int[] prices)
    {
        int maxProfit = 0;
        int min = 99999999;

        for (int i =0; i< prices.length;i++)
        {
            if (min>prices[i])
            {
                min = prices[i];

            }
            if ((prices[i]-min)>maxProfit)
            {
                maxProfit = prices[i]-min;
            }
        }
        return maxProfit;
    }
}
