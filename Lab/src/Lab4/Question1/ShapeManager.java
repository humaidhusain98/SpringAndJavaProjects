package Lab4.Question1;
public class ShapeManager {
	void manageShape(Shape shape) {
		shape.printDescription();
	}
	public static void main(String args[] ) {
		ShapeManager shapeManager=new ShapeManager();
		//Shape Class
		System.out.println();
		System.out.print("-----Shape Class------");
		Shape shape=new Shape();
		shapeManager.manageShape(shape);
		
		//Shape Class
		System.out.println();
		System.out.print("-----Shape Class------");
		Shape shapecolor=new Shape("Red");
		shapeManager.manageShape(shapecolor);
		
		//Circle Class
		System.out.println();
		System.out.print("-----Circle Class------");
		Circle circle=new Circle("Orange",10.5);
		shapeManager.manageShape(circle);
		
		//Rectangle Class
		System.out.println();
		System.out.print("-----Rectangle Class------");
		Rectangle rectangle=new Rectangle("Blue",20.8,30.1);
		shapeManager.manageShape(rectangle);
		
		//Square Class
		System.out.println();
		System.out.print("-----Square Class------");
		Square square=new Square("Yellow",25.0);
		shapeManager.manageShape(square);	
	}
}
