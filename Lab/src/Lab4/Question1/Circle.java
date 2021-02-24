package Lab4.Question1;

public class Circle extends Shape{
	double rad;
	public Circle(String color,double radius) {
		super(color);
		this.rad=radius;
	}
	@Override
	void printDescription() {
		System.out.println("Radius of the Circle= "+this.rad);
		System.out.println("Area of the Circle "+(3.14*this.rad*this.rad));
	}

}
