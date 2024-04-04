package ilp037.structural.adapter;

public class AdverrtisementAdapter extends Advertisement {

	private Ad ad;
	
	public AdverrtisementAdapter(Ad ad) {
		super(ad.description, 
				ad.description
				,ad.price);
		this.status = convertStatus(ad.status);
		this.ad = ad;
	}
	
	private AdvertisementStatus convertStatus(String status) {
		switch(status) {
		case "new" : return AdvertisementStatus.DRAFT;
		case "reviewed" : return AdvertisementStatus.PUBLISHED;
		case "deleted" : return AdvertisementStatus.DELETED;
		default: return AdvertisementStatus.DRAFT;
		}
	}
	
	@Override
	public void publish() {
		// TODO Auto-generated method stub
		ad.publish();
	}
	
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		ad.delete();
	}
	
	@Override
	public void active() {
		// TODO Auto-generated method stub
		ad.publish();
	}
	
	@Override
	public void inactive() {
		// TODO Auto-generated method stub
		ad.delete();;
	}

}
