package Lab1;

public class Q1 {
	public static void main(String[] args) {
		grade(500, 10);
		grade(610, 5);
		grade(610, 10);
		grade(710, 15);
		grade(710, 20);
		grade(800,30);
	}
	public static void grade(int sal,int merit) {
				
			if (sal>=800 && sal<=899)
				System.out.println("Grade A");
			if (sal>700 && sal<=799 && merit<20)
				System.out.println("Grade B");
			if(sal>700 && sal<=799 && merit>=20){
				System.out.println("Grade A");
			}
			
			
			if (sal>649 && sal<=799 && merit<20)
				System.out.println("Grade B");
			
			if (sal>=600 && sal<=649 && merit<10)
				System.out.println("Grade C");
			if (sal>=600 && sal<=649 && merit>10){
				System.out.println("Grade B");
			}
			
			if (sal>=500 && sal<600)
				System.out.println("Grade C");
			
		}
			
			
			
		
			

		
	
	
	

}
