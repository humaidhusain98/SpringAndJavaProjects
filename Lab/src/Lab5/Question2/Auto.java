package Lab5.Question2;

public class Auto extends Vehicle {


	public Auto() {
		setNumWheels(3);
	}
	
	void backward(double distance) {
		System.out.println("AUTO-driving "+distance+"km backward on " +getNumWheels()+" wheels");
		
	}

	void forward(double distance) {
		System.out.println("AUTO-driving "+distance+"km forward on " +getNumWheels()+" wheels");
	}

}
