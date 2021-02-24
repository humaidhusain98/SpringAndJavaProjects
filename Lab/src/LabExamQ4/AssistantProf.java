package LabExamQ4;

public class AssistantProf extends Professor{
	
	
	public AssistantProf(String n,int e) {
		super(n, e);
	}
	
	void display() {
		super.display();
		System.out.println("I am an Assistant Professor");
		System.out.println("I am teaching");
		
	}

}
