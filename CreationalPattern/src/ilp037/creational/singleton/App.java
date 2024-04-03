package ilp037.creational.singleton;

public class App {

	public static void main(String[] args) {
		Database d1 = Database.getSingleton();
		Database d2 = Database.getSingleton();
	
		if (d1.equals(d2)) {
			System.out.println("Objeto único");
		}else{
			System.out.println("Múltiplos objeto");
		}
		
		System.out.println("Qtd de objetos :"
				+ Database.counter);
	}

}
