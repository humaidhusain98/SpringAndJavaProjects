package savings;
import banking.*;
public class Sav_acc extends Accounts
{	double dwl;
	public Sav_acc(int i,String cn) 
	{	super(i,cn);
		balance=1000;
		
	}
	public Sav_acc(int i,String cn,int x) 
	{
		super(i,cn,x);
		dwl=0.5*x;
		
	}
	public void display() 
	{	
		System.out.println("Customer ID :"+cust_id);
		System.out.println("Customer Name :"+cust_name);
		System.out.println("Your Account Balance is "+balance);
	}
	public void withdraw(int amt) 
	{	
	
		if((amt>dwl) ||(amt>(balance-1000))||(amt<0)) 
		{
			System.out.println("Error!!!! Exceeded Daily withdrawal Limit or Insuffiecient Balance or amount is negative ");
		}//errormessage
		else 
		{
			balance=balance-amt;
			System.out.println("Withdrawal Successful Your Current Balance is : "+balance);
			
		}//Withdrawing
		
	}
	public void deposit(int amt) 
	{	if(amt>0)
		{
		balance=balance+amt;
		System.out.println("Deposit Successful!!! Your Current Balance is : "+balance);	
		}
		else 
		{
		System.out.println("Amount cannot be negative ");	
		}
	
		
	}
}
