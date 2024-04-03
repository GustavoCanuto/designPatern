package ilp037.creational.factorymethod;

public class SmsNotification implements Notification{
	
	@Override
	public void notifyUser() {
		System.out.println("sending a SMS to user...");
	}

}
