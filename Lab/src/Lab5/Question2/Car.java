package Lab5.Question2;

public class Car extends Vehicle{

	public Car() {
		setNumWheels(4);
	}
	
	void forward(double distance) {
		System.out.println("driving "+distance+"km forward on " +getNumWheels()+" wheels");
		
	}

	void backward(double distance) {
		System.out.println("driving "+distance+"km backward on " +getNumWheels() + " wheels");
		
	}

}
