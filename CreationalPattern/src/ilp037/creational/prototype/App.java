package ilp037.creational.prototype;

public class App {

	public static void main(String[] args) {
		Person p1 =  new Person();
		p1.document = 4543543L;
		p1.name = "John";
		System.out.println(p1);
		
		Person p2 =  p1.copy();
		p2.document = 4543L;
		p2.name = "maria";
		System.out.println(p2);
	}

}
