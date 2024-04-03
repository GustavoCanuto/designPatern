package ilp037.creational.abstractfactory;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = "ORC";
		KingdomFactory factory = KingdomFactory.getInstance(type);
	}

}
