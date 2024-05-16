package ilp037.behavioural.chainofresponsability;

public class Dispenser50Chain extends Chain{
	
	@Override
	void execute(Currency cur) {
		if(cur.getAmount() >= 50) {
			int num = cur.getAmount()/50;
			int reminder = cur.getAmount()% 50;
			System.out.println("Dispensing "+num+" $50 notes");
			
			if(reminder>0)
				this.nextChain.execute(new Currency(reminder));
		}else {
			this.nextChain.execute(cur);
		}
	}

}
