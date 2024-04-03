package ilp037.creational.factorymethod;

public class SocketNotification implements Notification{
	
	@Override
	public void notifyUser() {
		System.out.println("sending a Socket to user...");
	}

}
