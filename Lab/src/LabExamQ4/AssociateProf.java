package LabExamQ4;

public class AssociateProf extends Professor{
	
	public AssociateProf(String n,int e) 
	{
		super(n, e);
	}
	void display() {
		super.display();
		System.out.println("I am an Associate Professor");
		System.out.println("I am heading a Research Group");
		
		
	}

}
