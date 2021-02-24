import java.util.Scanner;

public class IFCSManager {
	private static Equipment[] listEquipments=new Equipment[100];
	 static int top=-1;
	
	 
	 public static void add(Equipment A) {
		 top=top+1;
		 listEquipments[top]=A;
	 }
	 
	 public static void remove(String id) {
		 for(int i=0;i<=top;i++) {
			 if(listEquipments[i].getId().equals(id)) {
				 listEquipments[i].setId("null");
				 listEquipments[i].setDescription("null");
				 break;
				 
				 
				 
			 }
				 
		 }
	 }
	 
	 public static void check(String id) {
		 int flag=0;
		 for(int i=0;i<=top;i++) {
			 if(listEquipments[i].getId().equals(id)) {
				 System.out.println("Equipment Found");
				 System.out.println("Equipment id="+id);
				 System.out.println("Equipment Description="+listEquipments[i].getDescription());
				 flag=1;
				 break;
				 
				 
			 }
			 
		 }
		 if (flag==0) {
			 System.out.println("Equipment not found");
			 }
	 }
	 
	 
	 public static void display() {
		 System.out.println("---Equipment Id--------------------------Equipment Name----------------");
		 
		 for(int i=0;i<=top;i++) {
			 if(listEquipments[i].getId()!="null") {
			 System.out.println(listEquipments[i].getId()+"                                    "+ listEquipments[i].getDescription());
			 
			 }
		 }
		 
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		while(true) {
			int choice;
			System.out.println();
			System.out.println("Press 1 For adding new Equipment  ");
			System.out.println("Press 2 For removing an Equipment instance specified by its id ");
			System.out.println("Press 3, check if the Equipment instance resides in the Lab using the id given by user ");
			System.out.println("Press 4 To display the list of Equipment instances in the Lab ");
			System.out.println("Press 5 To exit the program ");
			choice=input.nextInt();
			if (choice==5)
				break;
			switch(choice) {
			case 1:
			{ 
					String eqId;
					String eqDes;
					System.out.print("Enter Equipment id:");
					eqId=input.next();
					
					System.out.print("Enter Equipment Description:");
					eqDes=input.next();
					
					Equipment eqpEquipment=new Equipment(eqId, eqDes);
					add(eqpEquipment);
					System.out.println("Equipment added Successfully!!!");
					
					
					break;
				
			}
			case 2:{
				String eqId;
				System.out.print("Enter Equipment id to remove:");
				eqId=input.next();
				remove(eqId);
				break;
				
				
				
			}
			
			case 3:{
				String eqId;
				System.out.print("Enter Equipment id to check:");
				eqId=input.next();
				check(eqId);
				break;
			}
			case 4:{
				display();
				break;
				
			}
			
			}
			
			
			
			
			
			
		}
		
		
		
	}
	
	

}
