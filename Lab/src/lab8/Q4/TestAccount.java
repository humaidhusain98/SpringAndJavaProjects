package lab8.Q4;

import java.util.Scanner;

public class TestAccount {
	
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		long acno,bal;
		System.out.println("Enter Account Number: ");
		acno=scanner.nextLong();
		System.out.println("Enter Balance: ");
		bal=scanner.nextLong();
		CheckingAccount object1=new CheckingAccount(acno, bal);
		
		
		System.out.println();
		System.out.println("Enter Account Number: ");
		acno=scanner.nextLong();
		System.out.println("Enter Balance: ");
		bal=scanner.nextLong();
		CheckingAccount object2=new CheckingAccount(acno, bal);
		scanner.close();
		
	}
	
}
