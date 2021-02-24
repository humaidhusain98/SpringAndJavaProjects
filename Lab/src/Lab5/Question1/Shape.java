package Lab5.Question1;

public abstract class Shape {
	private String colour="orangle";

	public String getColour() {
		return colour;
	}

	protected boolean setColour(String colour) {
		this.colour = colour;
		return true;
	}
	
	public abstract String show();
	
	public abstract double getArea();
	
}
