package LabExamQ4;
import java.util.Scanner;

public class HRManager {
	
	public static void main(String args[]) 
	{
		Scanner scanner=new Scanner(System.in);
		String name;
		int exp;
		System.out.print("Enter Full Name:");
		name=scanner.nextLine();
		System.out.println("Enter Years of experience");
		exp=scanner.nextInt();
		if(exp<5)
		{
			AssistantProf prof=new AssistantProf(name,exp);
			prof.display();
		}
		else if(exp>=5 && exp<10) 
		{
			AssociateProf prof =new AssociateProf(name, exp);
			prof.display();
		}
		else 
		{
			HOD prof=new HOD(name,exp);
			prof.display();
			
			
		}
		
		scanner.close();	
		
	}

}
