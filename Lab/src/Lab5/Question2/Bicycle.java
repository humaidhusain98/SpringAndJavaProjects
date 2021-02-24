package Lab5.Question2;

public class Bicycle extends Vehicle {

	
	public Bicycle() {
		setNumWheels(2);
	}

	
	void forward(double distance) {
		System.out.println("pedalling "+distance+"km forward on " +getNumWheels()+" wheels");
	}

	
	void backward(double distance) {
		System.out.println("pedalling "+distance+"km backward on " +getNumWheels()+ " wheels");
		
	}

}
