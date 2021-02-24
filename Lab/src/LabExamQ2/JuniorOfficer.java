package LabExamQ2;

public class JuniorOfficer extends Officer {


	void withdraw(int amt) {
		if (amt>10000)
			System.out.println("Junior Officer can approve upto Rs 10,000 only");
		else {
			System.out.println("Rs " +amt+" withdrawal Successful" );
		}
		
	}

}
