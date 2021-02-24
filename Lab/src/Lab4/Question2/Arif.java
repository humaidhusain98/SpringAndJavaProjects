package Lab4.Question2;

import java.util.Scanner;

public class Arif {
	public static void main(String args[]) {
		int choice;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Arif is a CSE Student at IEM, who secretly moonlights as a hacker.  Have Arif introduce himself");
		System.out.println("(PRESS 1) at a get-together for student leaders of various colleges in Salt Lake\n" + 
				"");
		System.out.println("(PRESS 2) at a closed-door Hacker Society meeting");
		System.out.println("(PRESS 3) at his cousin's birthday party where he meets a beautiful girl who is a Tagore fan.");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:	{	Student arif=new Student("Arif");
					arif.introduce();
					break;
					}
		case 2:	{	CSEStudent arif=new CSEStudent("Arif");
					arif.introduce();
					break;
					}
		
		
		case 3:	{	Person arif=new Person("Arif");
					arif.introduce();
					break;
				}
		default:{
					System.out.println("Wrong Choice");
					break;
					}
		
		}
		
	}
}
