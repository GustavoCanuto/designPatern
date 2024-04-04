package ilp037.structural.bridge;

public class Cicle extends Shape {

	
	public Cicle (Color color) {
		super(color);
	}

	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "draw a circle with "+ color.fill();
	}

	
}
