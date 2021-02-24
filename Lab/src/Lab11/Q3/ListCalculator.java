package Lab11.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListCalculator 
{
	static List<Integer> addLists(List<Integer> lst1,List<Integer> lst2)
	{
		List<Integer> lst3=new ArrayList<Integer>();
		for(int i=0;i<lst1.size();i++) 
		{
			int sum=0;
			sum=lst1.get(i)+lst2.get(i);
			lst3.add(sum);
			
		}
		
		return lst3;
	}
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		List<Integer> l1=new ArrayList<Integer>();
		System.out.println("Enter Number of Elements in List 1");
		int n;
		n=scanner.nextInt();
		for(int i=0;i<n;i++) 
		{	int x;
			System.out.println("Enter Element "+(i+1)+" :");
			x=scanner.nextInt();
			l1.add(x);
		}
		List<Integer> l2=new ArrayList<Integer>();
		System.out.println("Enter Number of Elements in List 2");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) 
		{	int x;
			System.out.println("Enter Element "+(i+1)+" :");
			x=scanner.nextInt();
			l2.add(x);
		}
		
		if(l1.size()!=l2.size()) 
		{
			System.out.println("List are not Equal in Length!!!Error");
		}
		else 
		{	System.out.println("Elements in List 3 after addition :");
			List<Integer> l3=addLists(l1, l2);
			for(int i=0;i<l3.size();i++)
			{
				System.out.println("Element "+(i+1)+" : "+l3.get(i));
			}
			
		}
		
	}	
}
