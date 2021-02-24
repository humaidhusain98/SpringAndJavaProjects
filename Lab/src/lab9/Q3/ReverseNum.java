package lab9.Q3;
import java.util.Scanner;

public class ReverseNum {

	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("Enter a positive number to reverse :");
		num=scanner.nextInt();
		if(num<=0) 
		{
			System.out.println("Invalid Input!!!!");
			
		}
		else 
		{
			int copy=num;
			int rev,rem;rev=0;
			while(copy>0) 
			{
				rem=copy%10;
				rev=10*rev+rem;
				copy=copy/10;
				
			}
			
			System.out.println("Reverse Number : "+rev);
			
			
		}
		scanner.close();
		
	}//main
	
}//class
