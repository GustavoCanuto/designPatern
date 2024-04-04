package ilp037.structural.adapter;

public class Advertisement {
	String title;
	String descriptiom;
	Double price;
	AdvertisementStatus status = AdvertisementStatus.DRAFT;
	
	public Advertisement (String title,
			String description
			,Double price) {
		
		this.title = title;
		this.descriptiom = description;
		this.price = price;
	}
	
	public void publish() {
		System.out.println("Advertisement publishment process");
	}
	public void inactive() {
		System.out.println("Advertisement inactivation process");
	}
	public void active() {
		System.out.println("Advertisement activition process");
	}
	public void delete() {
		System.out.println("Advertisement deleting process");
	}

	@Override
	public String toString() {
		return String.format("Advertisement=(%S, %s, $.2f, %s)"
				, title
				, descriptiom
				, price
				, status);
	}
}
