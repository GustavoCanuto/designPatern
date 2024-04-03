package ilp037.creational.builder;

public class App {

	public static void main(String[] args) {
		
//       Hero h = new Hero (new Armor(), new HairColor(), new Profession());
       
		Hero h = new Hero().newBuilder()
				.withArmor(new Armor())
				.withHairColor(new HairColor())
				.build();
		
       System.out.println(h);
       
	}

}
