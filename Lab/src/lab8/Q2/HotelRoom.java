package lab8.Q2;


public class HotelRoom
{
	private int roomNo;
	private double nightlyRental;

	public int getRoomNo()
	{
	return this.roomNo;
	}

	public double getNightlyRental()
	{
	return this.nightlyRental;
	}


	HotelRoom(int rn) 
	{
	this.roomNo=rn;
	if(rn<=299)
               this.nightlyRental=69.95;
	else
               this.nightlyRental=89.95;

	}


}