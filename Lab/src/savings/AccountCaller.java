package savings;
import java.util.Scanner;import java.util.regex.Pattern;import savings.Sav_acc;
public class AccountCaller 
{	public static void main(String args[]) 
	{	Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 for Opening Savings Account with minimum Balance");
		System.out.println("Enter 2 for Opening Savings Account with User Input Balance");
		System.out.println("Enter 3 for Opening Current Account with 0 Balance");
		System.out.println("Enter any other value for Opening Current Account with User Input Balance");
		int choice=scanner.nextInt();
		Pattern pattern=Pattern.compile("\\s*");
		
		System.out.print("Enter Customer Id:");
		int id=scanner.nextInt();
		
		System.out.print("Enter Customer Name:");
		scanner.skip(pattern);
		String name=scanner.nextLine();
		if(choice==1)
		{
			Sav_acc account=new Sav_acc(id,name);
			
			while(true) 
			{
				
				System.out.println("Enter 1 to Withdraw ");
				System.out.println("Enter 2 to Deposit");
				System.out.println("Enter 3 to check balance");
				System.out.println("Enter 4 to exit");
				int ch=scanner.nextInt();
				if(ch==4)
					break;
				switch(ch)
				{	case 1:
					{int am;
					System.out.println("Enter Amount to Withdraw");
					am=scanner.nextInt();
					account.withdraw(am);
					break;
					}
					case 2:
					{
					int am;
					System.out.println("Enter Amount to Deposit");
					am=scanner.nextInt();
					account.deposit(am);
					break;
					}
					case 3:
					{
					account.display();
					break;
					}
					default:
					{
					System.out.println("Wrong Choice");	
						
					}		
				
				}
				
				
			}
			
			
		}
		else if(choice==2) 
		{
			int bal;
			System.out.println("Enter Balance to Deposit for Opening Savings Account");
			bal=scanner.nextInt();
			Sav_acc account=new Sav_acc(id,name,bal);
			
			while(true) 
			{
				
				System.out.println("Enter 1 to Withdraw ");
				System.out.println("Enter 2 to Deposit");
				System.out.println("Enter 3 to check balance");
				System.out.println("Enter 4 to exit");
				int ch=scanner.nextInt();
				if(ch==4)
					break;
				switch(ch)
				{
					case 1:
					{
					int am;
					System.out.println("Enter Amount to Withdraw");
					am=scanner.nextInt();
					account.withdraw(am);
					break;
					}
					case 2:
					{
					int am;
					System.out.println("Enter Amount to Deposit");
					am=scanner.nextInt();
					account.deposit(am);
					break;
					}
					case 3:
					{
					account.display();
					break;
					}
					default:
					{
					System.out.println("Wrong Choice");	
						
					}		
				
				}
				
				
			}
			
			
		}
		else if(choice==3) 
		{
			Curr_acc account=new Curr_acc(id,name);
			
			while(true) 
			{
				
				System.out.println("Enter 1 to Withdraw ");
				System.out.println("Enter 2 to Deposit");
				System.out.println("Enter 3 to check balance");
				System.out.println("Enter 4 to exit");
				int ch=scanner.nextInt();
				if(ch==4)
					break;
				switch(ch)
				{
					case 1:
					{
					int am;
					System.out.println("Enter Amount to Withdraw");
					am=scanner.nextInt();
					account.withdraw(am);
					break;
					}
					case 2:
					{
					int am;
					System.out.println("Enter Amount to Deposit");
					am=scanner.nextInt();
					account.deposit(am);
					break;
					}
					case 3:
					{
					account.display();
					break;
					}
					default:
					{
					System.out.println("Wrong Choice");	
						
					}		
				
				}
				
				
			}
			
			
		} 
		else 
		{
			int bal;
			System.out.println("Enter Balance to Deposit for Opening Current Account");
			bal=scanner.nextInt();
			Curr_acc account=new Curr_acc(id,name,bal);
			
			
			while(true) 
			{
				
				System.out.println("Enter 1 to Withdraw ");
				System.out.println("Enter 2 to Deposit");
				System.out.println("Enter 3 to check balance");
				System.out.println("Enter 4 to exit");
				int ch=scanner.nextInt();
				if(ch==4)
					break;
				switch(ch)
				{
					case 1:
					{
					int am;
					System.out.println("Enter Amount to Withdraw");
					am=scanner.nextInt();
					account.withdraw(am);
					break;
					}
					case 2:
					{
					int am;
					System.out.println("Enter Amount to Deposit");
					am=scanner.nextInt();
					account.deposit(am);
					break;
					}
					case 3:
					{
					account.display();
					break;
					}
					default:
					{
					System.out.println("Wrong Choice");	
						
					}		
				
				}
				
				
			}	
		} scanner.close();	
	}
}
