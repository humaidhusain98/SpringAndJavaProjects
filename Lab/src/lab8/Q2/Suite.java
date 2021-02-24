package lab8.Q2;

public class Suite extends HotelRoom{
	double nightlyRental;
	Suite(int rn){
		super(rn) ;
		if(rn>299)
		{          this.nightlyRental=1.15*super.getNightlyRental();
        }
		else
		{          this.nightlyRental=super.getNightlyRental();}

		this.nightlyRental=this.nightlyRental+40;

	}//end Of constructor

	public double getNightlyRental() {
		return this.nightlyRental;
	}//getter method




}//end of class