package savings;
import banking.Accounts;

public class Curr_acc extends Accounts
{
	public Curr_acc(int i,String cn) 
	{	
		super(i,cn);
		balance=0;
		
	}
	public Curr_acc(int i,String cn,int x) 
	{
		super(i,cn,x);
		
	}
	
	public void display() 
	{
		System.out.println("Customer ID :"+cust_id);
		System.out.println("Customer Name :"+cust_name);
		System.out.println("Your Account Balance is "+balance);
	}
	public void withdraw(int amt) 
	{	
		if(amt>0) 
		{
			balance=balance-amt;
			System.out.println("Withdrawal Successful Your Current Balance is : "+balance);
		}
		else 
		{
			System.out.println("Amount cannot be negative ");	
		}
	
		
	}
	public void deposit(int amt) 
	{
		
		if(amt<10000 ||(amt<0)) 
		{
			System.out.println("Error!!!! Cannot Be Deposited as amount is less than 10000 ");
			
		}//errormessage
		else 
		{
			balance=balance+amt;
			System.out.println("Deposit Successful Your Current Balance is : "+balance);	
			
		}//Depositing
		
	}
	
	
}
