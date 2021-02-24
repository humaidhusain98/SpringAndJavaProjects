package LabExamQ4;

public class Professor {
	
	String name;
	int experience;
	
	public Professor(String nam,int exp) 
	{
		name=nam;
		experience=exp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	void display() {
		System.out.println("I am "+name);
		
	}
	
}
