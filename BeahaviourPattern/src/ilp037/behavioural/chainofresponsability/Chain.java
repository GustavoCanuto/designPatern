package ilp037.behavioural.chainofresponsability;

public abstract class Chain {
	
	protected Chain nextChain;
	
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}
	
	abstract void execute(Currency cur);

}
