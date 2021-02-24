package LabExamQ4;

public class HOD extends Professor {
	
	public HOD(String n,int e) 
	{
		super(n, e);
	}
	
	
	void display() 
	{
		super.display();
		System.out.println("I am a HOD");
		System.out.println("I am heading a Department");
	}
	

}
