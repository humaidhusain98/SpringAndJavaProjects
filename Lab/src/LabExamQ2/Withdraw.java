package LabExamQ2;

public class Withdraw {
	public static void main(String[] args) {
		JuniorOfficer jOfficer=new JuniorOfficer();
		jOfficer.withdraw(25000);
		
		jOfficer.withdraw(1000);
		
		SeniorOfficer sOfficer=new SeniorOfficer();
		sOfficer.withdraw(25000);
		
		sOfficer.withdraw(77000);
		
		ExecutiveOfficer eOfficer=new ExecutiveOfficer();
		eOfficer.withdraw(200000);
		
		eOfficer.withdraw(7200);
		
		
		
		
		
		
		
		
	}
	
}
