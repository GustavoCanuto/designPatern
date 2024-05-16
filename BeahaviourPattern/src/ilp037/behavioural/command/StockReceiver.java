package ilp037.behavioural.command;

public class StockReceiver {
	private String ticker;
	private Integer quantity;
	private Double price;
	
	public StockReceiver(String ticker, Integer quantity, Double price) {
		super();
		this.ticker = ticker;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void buy() {
		System.out.printf("buying %d from %s consting %.2f \n",this.quantity,this.ticker,this.price);

	}

	public void sell() {
		System.out.printf("buying %d from %s consting %.2f \n",this.quantity,this.ticker,this.price);

	}

	public void rent() {
		System.out.printf("buying %d from %s consting %.2f \n",this.quantity,this.ticker,this.price);

	}

}
