package lab9.Q4;

import java.util.Scanner;
import java.util.regex.Pattern;
import lab9.Q4.Student;

public class RunStudent {
	public static void main(String args[]) 
	{	Scanner scanner=new Scanner(System.in);
		Pattern pattern=Pattern.compile("\\s*");
		String clgname,stud1,stud2;
		System.out.println("Enter College Name");
		clgname=scanner.nextLine();
		System.out.println("Enter Student 1 Name");
		scanner.skip(pattern);
		stud1=scanner.nextLine();
		
		System.out.println("Enter Student 2 Name");
		scanner.skip(pattern);
		stud2=scanner.nextLine();
		
		Student.setCllg(clgname);
		Student s1=new Student(stud1);
		s1.setRollNo(Student.setRollNo());
		Student s2=new Student(stud2);
		s2.setRollNo(Student.setRollNo());
		s1.getStudentInfo();
		System.out.println();
		
		
		s2.getStudentInfo();
		scanner.close();
		
	}
	
}
