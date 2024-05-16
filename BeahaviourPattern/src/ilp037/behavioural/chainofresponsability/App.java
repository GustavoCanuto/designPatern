package ilp037.behavioural.chainofresponsability;

public class App {
	
	private Chain chain;
	
	public App() {
		chain = new Dispenser50Chain();
		Chain c2 = new Dispenser20Chain();
		chain.setNextChain(c2);
		Chain c3 = new Dispenser10Chain();
		c2.setNextChain(c3);
		
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.chain.execute(new Currency(180));
		
	}

}
