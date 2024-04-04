package ilp037.structural.bridge;

public class App {

	public static void main(String[] args) {
		Cicle bCicle = new Cicle(new Blue());
		System.out.println(bCicle.draw());
		
		Cicle rCicle = new Cicle(new Red());
		System.out.println(rCicle.draw());
	}
}
