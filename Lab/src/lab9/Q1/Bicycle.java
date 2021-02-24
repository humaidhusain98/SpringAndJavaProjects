package lab9.Q1;

public class Bicycle {
	
	private int gear;
	private int speed;
	
	public Bicycle(int g,int s) 
	{
		gear=g;
		speed=s;
	}
	
	public void putBrakes(int decrement) 
	{
		speed=speed-decrement;
	}

	public String toString() 
	{
		return "Bicycle [gear=" + gear + "rd, speed=" + speed + "km/hr]";
	}

}
