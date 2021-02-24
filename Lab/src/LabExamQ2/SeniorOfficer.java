package LabExamQ2;

public class SeniorOfficer extends JuniorOfficer {

		@Override
		void withdraw(int amt) {
			if (amt>50000)
				System.out.println("Senior Officer can approve upto Rs 50,000 only");
			else {
				System.out.println("Rs " +amt+" withdrawal Successful" );
			}
		}
}
