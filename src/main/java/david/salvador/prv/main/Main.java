package david.salvador.prv.main;

import david.salvador.prv.stocks.Apple;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by David Salvador on 05-11-2016.
 * djcsalvador@gmail.com
 */
public class Main {

    public static void main (String [] args){

        int[] stocks= new int[]{10, 7, 5, 8, 11, 9};//new int[]{10, 7, 5, 8, 11, 9};//new int[]{11, 10, 9, 8, 7, 6};
        int result;

        Instant start = Instant.now();
        //result=Apple.getMaxProfit(stocks);
        result=Apple.getMaxRecursive(stocks,0,stocks[0],stocks[1],0,0);
        Instant stop = Instant.now();
        System.out.println("Result is: "+result+" and method took "+ Duration.between(start, stop));

    }
}
