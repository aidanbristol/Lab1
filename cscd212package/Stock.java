package cscd212package;


	/** Stock class definition **/
	public class Stock implements Comparable<Stock>{
	   //instance variables
	   private String companyName;
	   private double purchasePrice;
	   private String ticker;
	   //parameterized constructor
	   public Stock(String ticker,String cname,double price) {
	       this.ticker=ticker;
	       companyName=cname;
	       purchasePrice=price;
	   }
	   //parameterized constructor in different order of variables
	   public Stock(double purchasePrice, String ticker, String companyName)
	   {
	       this.purchasePrice=purchasePrice;
	       this.ticker=ticker;
	       this.companyName=companyName;
	   }
	   //this method returns the value of variable purchasePrice
	   public double getPurchasePrice()
	   {
	       return purchasePrice;
	   }
	   //this method compares the current Stock object with another Stock object based on the companyName attribute
	   public int compareTo(Stock another)
	   {
	       try
	       {
	           return this.companyName.compareTo(another.companyName);
	       }
	       //displays the error message when another Stock object is null
	       catch(Exception e)
	       {
	           throw new IllegalArgumentException(e);
	       }
	   }
	   //hashCode() method
	   @Override
	   public int hashCode() {
	       final int prime = 31;
	       int result = 1;
	       result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
	       long temp;
	       temp = Double.doubleToLongBits(purchasePrice);
	       result = prime * result + (int) (temp ^ (temp >>> 32));
	       result = prime * result + ((ticker == null) ? 0 : ticker.hashCode());
	       return result;
	   }
	   //equals() method checks the equality of two Stock objects
	   @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       Stock other = (Stock) obj;
	       if (companyName == null) {
	           if (other.companyName != null)
	               return false;
	       } else if (!companyName.equals(other.companyName))
	           return false;
	       if (Double.doubleToLongBits(purchasePrice) != Double.doubleToLongBits(other.purchasePrice))
	           return false;
	       if (ticker == null) {
	           if (other.ticker != null)
	               return false;
	       } else if (!ticker.equals(other.ticker))
	           return false;
	       return true;
	   }
	   //this method returns the status of Stock object
	   @Override
	   public String toString() {
	       return companyName + " - "+ticker+"\nPurchasePrice:" + purchasePrice ;
	   }


	}	
	

