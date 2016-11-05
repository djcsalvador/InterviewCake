package david.salvador.prv.stocks;

/**
 * Created by David Salvador on 05-11-2016.
 * djcsalvador@gmail.com
 * QUESTION: https://www.interviewcake.com/question/java/stock-price
 */
public class Apple {

    public static int getMaxProfit(int[] stockPrices) {

        int min = stockPrices[0], max = -1;
        int maxProfit=0;
        int minLoss=0;

        for (int i = 1; i < stockPrices.length; i++) {
            if(stockPrices[i]<min)
            {
                min=stockPrices[i];
                continue;
            }
            if(stockPrices[i]>max)
                max=stockPrices[i];
        }
        return max-min;
    }
    
    public static int getMaxRecursive(int[] stocks, int current, int buy, int sell, int profit, int loss ){


        int temp = sell - buy;

        if(temp>0) //positive
        {
            if(temp>profit)
                profit=temp;
        }
        else // negative
        {
            if(profit==0)
            {
                temp = temp*-1;
                if(loss==0 || loss>temp)
                    loss = temp;
            }
        }

        current++;
        //Break rule
        if(current == stocks.length-1)
        {
            if(profit>0)
                return profit;
            return loss;
        }

        if(buy>stocks[current])
            buy=stocks[current];

        return getMaxRecursive(stocks,current,buy,stocks[current+1],profit,loss);
    }

}
