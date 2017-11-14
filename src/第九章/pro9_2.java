package 第九章;


public class pro9_2 {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation. ");
	      stock.setPre(34.5);

	      // Set current price
	      stock.setCurr(34.35);

	      // Display stock info
	      System.out.println("Previous Closing Price: " +
	        stock.getPreviousClosingPrice());
	      System.out.println("Current Price: " +
	        stock.getCurrentPrice());
	      System.out.println("Price Change: " +
	        stock.getChangePercent() * 100 + "%");
	}
	
}
class Stock{
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	public Stock(){
		
	}
	public Stock(String symbol,String name){
		this.symbol=symbol;
		this.name=name;
	}
	public void setPre(double pre){
		previousClosingPrice=pre;
	}
	public void setCurr(double cur){
		currentPrice=cur;
	}
	 public double getPreviousClosingPrice() {
		    return previousClosingPrice;
		  }
		  
		  public double getCurrentPrice() {
		    return currentPrice;
		  }
	public double getChangePercent(){
		return (currentPrice-previousClosingPrice)/previousClosingPrice;
	}
	
}