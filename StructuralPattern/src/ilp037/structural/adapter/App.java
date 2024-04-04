package ilp037.structural.adapter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Advertisement adv1 = new Advertisement("titulo 1",
				"descricao", 10.0);
		
		adv1.publish();
		adv1.inactive();
		adv1.active();
		adv1.delete();
		
		Ad ad = new Ad();
		ad.description = "smarth";
		ad.price = 150.0;
		ad.status = "reviewed";
		
		Advertisement adv2 = new AdverrtisementAdapter(ad);
		adv2.publish();
		adv2.inactive();
		adv2.active();
		adv2.delete();
		
	}

}
