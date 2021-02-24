package Lab5.Question2;

public abstract class Vehicle {
	private int numWheels;
	
	
	
	public int getNumWheels() {
		return numWheels;
	}



	protected void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}



	public  void honk(String name) {
		System.out.println(name+"-HONK!");
	}
	
	 abstract void forward(double distance);
	abstract  void backward(double distance);
	
	
	
}
