package Lab4.Question1;

public class Rectangle extends Shape {
	private double len;
	private double bre;
	public double getLen() {
		return len;
	}


	public double getBre() {
		return bre;
	}

	public Rectangle(String color,double length,double breadth) {
		super(color);
		this.len=length;
		this.bre=breadth;
	}
	
	@Override
	void printDescription() {
		
		System.out.println("Length of the Rectangle= "+this.len);
		System.out.println("Breadth of the Rectangle "+this.bre);
		System.out.println("Area of the Rectangle "+(this.bre*this.len));
	}
}
