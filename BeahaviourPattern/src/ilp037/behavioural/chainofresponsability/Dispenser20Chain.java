package ilp037.behavioural.chainofresponsability;

public class Dispenser20Chain extends Chain{
	
	@Override
	void execute(Currency cur) {
		if(cur.getAmount() >= 20) {
			int num = cur.getAmount()/20;
			int reminder = cur.getAmount()% 20;
			System.out.println("Dispensing "+num+" $20 notes");
			
			if(reminder>0)
				this.nextChain.execute(new Currency(reminder));
		}else {
			this.nextChain.execute(cur);
		}
	}

}
