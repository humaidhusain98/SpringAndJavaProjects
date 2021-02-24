package lab8.Q1;
import java.util.*;
public class Pay{
private double hoursWorked;
private double rateOfPayPerHr;
private double withholdingRate;
private double grossPay;
private double netPay;
	
	void computeNetPay(double hrs, double payrate, double wr) 
	{
		this.hoursWorked=hrs;
		this.rateOfPayPerHr=payrate;
		this.withholdingRate=wr;
		this.grossPay=hrs*payrate;
		this.netPay=grossPay-wr*hrs*payrate;
		System.out.println("Hours Worked= "+ this.hoursWorked+"\nRate of Pay Per Hour ="+this.rateOfPayPerHr+"\nWitholding Rate ="+this.withholdingRate+"\nGross Pay= "+this.grossPay+"\nNet Pay: "+this.netPay);

	}


	void computeNetPay(double hrs, double payrate)
	{
			this.hoursWorked=hrs;
			this.rateOfPayPerHr=payrate;
			this.withholdingRate=0.15;
			this.grossPay=hrs*payrate;
			this.netPay=grossPay-withholdingRate*hrs*payrate;
			System.out.println("Hours Worked= "+this.hoursWorked+"\nRate of Pay Per Hour ="+this.rateOfPayPerHr+"\nWitholding Rate ="+this.withholdingRate+"\nGross Pay="+this.grossPay+"\nNet Pay:"+this.netPay) ;
	}


	void computeNetPay(double hrs)
	{
		this.hoursWorked=hrs;
		this.rateOfPayPerHr=5.85;
		this.withholdingRate=0.15;	
		this.grossPay=hrs*rateOfPayPerHr;
		this.netPay=grossPay-withholdingRate*hrs*rateOfPayPerHr;
		System.out.println("Hours Worked="+this.hoursWorked+"\nRate of Pay Per Hour"+this.rateOfPayPerHr+"\nWitholding Rate"+this.withholdingRate+"\nGross Pay="+this.grossPay+"\nNet Pay:"+this.netPay) ;

	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in) ;
		double h, p, wr;
		System.out.println("Enter No of Hours worked") ;
		h=sc.nextDouble();
		Pay pay=new Pay();
		System.out.println("\nOverloaded method with 1 parameter");
		pay.computeNetPay(h);


		System.out.println("Enter Pay Rate Per Hour") ;
		p=sc.nextDouble() ;
		System.out.println("\nOverloaded method with 2 parameters");
		pay.computeNetPay(h, p) ;


		System.out.println("Enter Witholding Rate") ;
		wr=sc.nextDouble() ;
		System.out.println("\nOverloaded method with 3 parameters");
		pay.computeNetPay(h, p, wr) ;


		sc.close();
	}//end of main


}//end of Program