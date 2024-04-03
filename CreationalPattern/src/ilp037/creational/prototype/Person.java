package ilp037.creational.prototype;

public class Person 
	extends Prototype<Person>
	implements Cloneable{
	
	String name;
	Long document;
	
	public Person() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Long time to build...");
	}

	@Override
	public String toString() {
		return String.format(
				"Person=(name: %s, document: %d)"
				,name
				,document);
	}
}
