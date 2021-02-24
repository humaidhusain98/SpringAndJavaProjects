package lab8.Q4;

public class CheckingAccount {
	
	private long AccNo;
	private long Balance;
	
	public CheckingAccount(long ac,long bal) 
	{	AccNo=ac;
		if(bal<200)
		{
			Balance=0;
			printBalanceLow();
		}
		else 
		{
			Balance=bal;
			System.out.println("Account Number: "+AccNo);
			System.out.println("Your Balance is :"+bal);
		}
		
	}
	
	
	void printBalanceLow()
	{
		System.out.println("Account Number: "+AccNo);
		System.out.println("Dear Customer your balance is reduced to 0 as your account balance was less than 200 dollars");
	}

}
