package ilp037.creational.factorymethod;

public class NotificationFactory {
	
	public static Notification create(Notification.Type type) {
		switch (type) {
		case SMS : return new SmsNotification();
		case EMAIL : return new SocketNotification();
		default: throw new IllegalArgumentException("tipo desconhecido");
		}
	}
}
