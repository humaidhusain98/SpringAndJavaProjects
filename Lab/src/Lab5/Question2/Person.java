package Lab5.Question2;

public class Person {
	private String HOBBY="Reading";
	private String name;
	
	
	
	public String getHOBBY() {
		return HOBBY;
	}

	public void setHOBBY(String hOBBY) {
		HOBBY = hOBBY;
	}

	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void introduce() {
		System.out.println("Hello, my name is "+getName()+" and my hobby is "+HOBBY);
	}
	
	public void forward(double distance) {
		System.out.println("-walking "+distance+"km forward");
	}
	
	public void backward(double distance) {
		System.out.println("-walking "+distance+"km backward");
	}

}
