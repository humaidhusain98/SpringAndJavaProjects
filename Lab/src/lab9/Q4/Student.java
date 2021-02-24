package lab9.Q4;

public class Student {
	
	private String name;
	private int rollNo;
	private static String collegeName;
	private static int counter=0;
	Student(String nam)
	{
		name=nam;
		
	}
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
	}
	static int setRollNo() 
	{
		counter=counter+1;
		return counter;
	}
	
	static void setCllg(String clgname) 
	{
		collegeName=clgname;
		
	}
	void getStudentInfo() 
	{
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+rollNo);
		System.out.println("College Name: "+collegeName);
	}
}
