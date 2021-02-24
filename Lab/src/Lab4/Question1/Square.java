package Lab4.Question1;

public class Square extends Rectangle{
	public Square(String color,double side) {
		super(color,side, side);		
	}
	
	@Override
	void printDescription() {
	
		System.out.println("Side of the Square "+getLen());
		System.out.println("Area of the Square "+(getLen()*getLen()));
	}
	
}
