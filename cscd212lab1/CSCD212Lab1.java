package cscd212lab1;

import java.io.*;
import java.util.*;
import cscd212package.Stock;
import cscd212package.StockPriceComparator;

/**
 * The provided testing class to verify your code is correct
 * <br>NOTE: All parameters will be passed as final and all preconditions will be met
 * <br>NOTE: The package system
 * <br>NOTE: You can't change this class in any fashion
 */
public class CSCD212Lab1
{
   /**
    * The main method, used to verify the two classes you must write are correct
    * @param args Representing an array of command line items passed to main
    * <br>NOTE: You can't change this method in any fashion
    */ 
   public static void main(final String [] args)
   {
      Stock [] myStocks = new Stock[4];
      myStocks[0] = new Stock("MSFT", "Microsoft", 294.80);
      myStocks[1] = new Stock("HI", "Hillebrand", 40.98);
      myStocks[2] = new Stock(2792.93, "GOOG", "Alphabet");
      myStocks[3] = new Stock(143.43, "APPL", "Apple Inc");
      
      System.out.println("Printing Stocks in the order declared");
      for(Stock s: myStocks)
         System.out.println(s + "\n");
      
      System.out.println("\n\nPrinting Stocks after sorting based on the natural order");  
      Arrays.sort(myStocks);
      
      for(Stock s: myStocks)
         System.out.println(s + "\n");
         
      System.out.println("\n\nPrinting Stocks after sorting based on the total order");    
      Arrays.sort(myStocks, new StockPriceComparator());
      for(Stock s: myStocks)
         System.out.println(s + "\n");


      
         
         
        
   }// end main
   
}// end class