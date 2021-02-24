package Lab4.Question1;

public class Shape {
	private String color;
	Shape( ) {
		System.out.println();
		System.out.println("Default Constructor of Shape");
	}
	Shape(String color ){
		this.color=color;
		System.out.println();
		System.out.println("Color of Shape is :"+this.color);
		
	}
	void printDescription() {
		
		System.out.println("Prints the Dimensions and Area of Shape");
	}
	public String getColor() {
		return color;
	}
	
	

}
