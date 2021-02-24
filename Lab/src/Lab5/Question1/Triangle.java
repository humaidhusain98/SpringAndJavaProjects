package Lab5.Question1;


public class Triangle extends Shape implements Comparable{

	private int base=0;
	private int height=0;
	
	
	
	
	public Triangle(String colour,int base,int height) {
		this.setColour(colour);
		this.base=base;
		this.height=height;
		
	}

	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	public String show() {
		return ("I am a Triangle of Colour "+this.getColour());
	}

	public double getArea() {
		return (0.5*this.base*this.height);
	}

	public int compareTo(Object obj) {
		Triangle obj1=(Triangle) obj;
		if(this.getArea()>obj1.getArea())
			return 1;
		else if(this.getArea()==obj1.getArea())
			return 0;
		else
			return -1;
	}
	

}
