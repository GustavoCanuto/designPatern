package ilp037.behavioural.chainofresponsability;

public class Dispenser10Chain extends Chain{
	
	@Override
	void execute(Currency cur) {
		if(cur.getAmount() >= 10) {
			int num = cur.getAmount()/10;
			int reminder = cur.getAmount()% 10;
			System.out.println("Dispensing "+num+" $10 notes");
			
			if(reminder>0)
				this.nextChain.execute(new Currency(reminder));
		}else {
			this.nextChain.execute(cur);
		}
	}

}
