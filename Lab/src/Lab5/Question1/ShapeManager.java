package Lab5.Question1;

public class ShapeManager {
	public static void main(String args[]) {
		Triangle myTriangle=new Triangle(10, 15);
		System.out.println(myTriangle.show());
		
		Triangle yourTriangle=new Triangle("blue",10, 15);
		System.out.println(yourTriangle.show());

		System.out.println(myTriangle.compareTo(yourTriangle));
		
	}
	
	
}
