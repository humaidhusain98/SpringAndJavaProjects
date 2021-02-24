package lab9.Q2;

import java.util.Scanner;
import java.util.regex.Pattern;


public class EmployeeManager {
	private static Employee EmployeeArray[]=new Employee[100];
	 static int top=-1;
	
	 public static void add(Employee A) {
		 top=top+1;
		 EmployeeArray[top]=A;
	 }
	 public static void remove(String id) {
		 for(int i=0;i<=top;i++) {
			 if(EmployeeArray[i].getId().equals(id)) {
				 EmployeeArray[i].setId("null");
				 EmployeeArray[i].setFullName("null");
				 EmployeeArray[i].setSalary(0);
				 break;	 
			 }		 
		 }
	}
	 
	 public static void check(String id) {
		 int flag=0;
		 for(int i=0;i<=top;i++) {
			 if(EmployeeArray[i].getId().equals(id)) {
				 System.out.println("Employee Found");
				 System.out.println("Employee id="+id);
				 System.out.println("Employee Name= "+EmployeeArray[i].getFullName());
				 System.out.println("Employee Salary= "+EmployeeArray[i].getSalary());
				 flag=1;
				 break;		 
			 }
			 
		 }
		 if (flag==0) {
			 System.out.println("Equipment not found");
			 }
	 }
	 
	 public static void display() {
		 System.out.println("---Employee Id-------------------Employee Name--------------------------------Employee Salary----------");
		 
		 for(int i=0;i<=top;i++) {
			 if(EmployeeArray[i].getId()!="null") {
			 System.out.printf("%4s                            %-28s                        %7d",EmployeeArray[i].getId(),EmployeeArray[i].getFullName(),EmployeeArray[i].getSalary());
			 
			 }
		 }
		 
	 }
	

	public static void main(String args[]) 
	{
		Scanner input=new Scanner(System.in);
		while(true) {
			int choice;
			System.out.println();
			System.out.println("Press 1 For adding new Employee  ");
			System.out.println("Press 2 For removing an Employee specified by his/her id ");
			System.out.println("Press 3,to check if the Employee  resides in the Company by the id given by user ");
			System.out.println("Press 4 To display the list of Employees in the Company ");
			System.out.println("Press 5 To exit the program ");
			choice=input.nextInt();
			if (choice==5)
				break;
			switch(choice) {	
			case 1:
			{
				String emId;
				String emName;
				int sal;
				System.out.print("Enter Employee id:");
				emId=input.next();
				
				System.out.print("Enter Employee Full Name :");
				Pattern pattern=Pattern.compile("\\s*");
				input.skip(pattern);
				emName=input.nextLine();
				System.out.print("Enter Employee Salary: ");
				sal=input.nextInt();
				Employee emp=new Employee();
				emp.setFullName(emName);
				emp.setId(emId);
				emp.setSalary(sal);
				add(emp);
				System.out.println("Employee added Successfully!!!");
				
				break;
			}
			
			case 2:
			{
				String eqId;
				System.out.print("Enter Employee id to remove:");
				eqId=input.next();
				remove(eqId);
				break;
				
			}
			
			case 3:
			{
				String eqId;
				System.out.print("Enter Employee id to check:");
				eqId=input.next();
				check(eqId);
				
				break;
			}
			
			case 4:
			{
				display();
				
				break;
			}
			default:
			{
				
				System.out.println("Please Enter a valid choice");
				break;
			}		
		}//switch case
	}//while
			input.close();
	}
}
