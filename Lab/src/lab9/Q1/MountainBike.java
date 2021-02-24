package lab9.Q1;
import java.util.Scanner;
public class MountainBike extends Bicycle
{
	private int seatHeight;
	public MountainBike(int g, int s,int sh)
	{	super(g, s);
		seatHeight=sh;
	}
	@Override
	public String toString() 
	{	return "MountainBike [seatHeight=" + seatHeight + "cm, " + super.toString() + "]";
	}
	public static void main(String args[]) 
	{	int g,s,sh;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Current Gear: ");
		g=scanner.nextInt();
		
		System.out.println("Enter Speed in km/hr: ");
		s=scanner.nextInt();
		
		System.out.println("Enter Seat height in cm : ");
		sh=scanner.nextInt();
		
		MountainBike mBike=new MountainBike(g, s, sh);
		System.out.println(mBike.toString());
		
		System.out.println("Decrement Speed in km/hr: ");
		s=scanner.nextInt();
		mBike.putBrakes(s);
		
		System.out.println(mBike.toString());
		scanner.close();
	}
}
