package banking;
import java.util.Scanner;
import java.util.regex.Pattern;
public abstract class Accounts 
{	protected int cust_id;
	protected String cust_name;
	protected double balance;
	public Accounts(int i,String cn) {
		cust_id=i;
		cust_name=cn;
	
	}
	public Accounts(int i,String cn,double x)
	{	
		cust_id=i;
		cust_name=cn;
		
		balance=x;	
	}
	public abstract void display();	
}
