package cscd212package;
import java.util.Comparator;

	
	/** StockPriceComparator class which sorts the Stock objects based on the purchasePrice **/
	public class StockPriceComparator implements Comparator<Stock> {
	   //this method returns the difference between purchasePrice of two Stock objects
	   @Override
	   public int compare(Stock one, Stock another) {
	       return (int) (one.getPurchasePrice()-another.getPurchasePrice());
	   }

	}

