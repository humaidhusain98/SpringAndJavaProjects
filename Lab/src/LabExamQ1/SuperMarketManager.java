package LabExamQ1;

import java.util.Scanner;
import java.util.regex.Pattern;


public class SuperMarketManager {

	private static Item[] listItems=new Item[100];
	 static int top=-1;
	
	 
	 public static void add(Item A) {
		 top=top+1;
		 listItems[top]=A;
	 }
	 
	 public static void remove(String id) {
		 for(int i=0;i<=top;i++) {
			 if(listItems[i].getId().equals(id)) {
				 listItems[i].setId("null");
				 break;
				 
				 
				 
			 }
				 
		 }
	 }
	 
	 
	 
	 public static void display() {
		 System.out.println("----id-----------Description-----------Weight-------Unit Price-----Quantity--------Price");
		 double total=0.0;
		 for(int i=0;i<=top;i++) {
			 if(listItems[i].getId()!="null") {
				 if(listItems[i].getWeight()>0) {
					 System.out.println(listItems[i].getId()+" Fruits and Vegetables--       "+ listItems[i].getDescription()+"      "+listItems[i].getWeight()+"       "+listItems[i].getUnitprice()+ "                        "+ listItems[i].getPrice());
				 }
				 else {
					 System.out.println(listItems[i].getId()+" Electrical Appliances--"+ listItems[i].getDescription()+"                      "+listItems[i].getUnitprice()+ "            "+listItems[i].getQuantity()+ "                  "+ listItems[i].getPrice());
					 
				 }
				 total= total+listItems[i].getPrice();
				 
			 }
		 }
		 System.out.println("Total = "+total);
		 
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		while(true) {
			int choice;
			System.out.println();
			System.out.println("Press 1 For adding Electrical Appliances and Snacks");
			System.out.println("Press 2 For adding Fruit and Vegetables");
			System.out.println("Press 3 For removing an Item instance specified by its id ");
			System.out.println("Press 4 To display the list of Equipment instances in the Lab ");
			System.out.println("Press 5 Checkout ");
			choice=input.nextInt();
			if (choice==5)
				break;
			switch(choice) {
			case 1:
			{ 		Pattern pattern=Pattern.compile("\\s*");
					String Id;
					String Des;
					int up,qty;
					System.out.print("Enter Electrical Appliances/Snacks id:");
					Id=input.next();
					
					System.out.print("Enter Electrical Appliances/Snacks Description:");
					Des=input.next();
					
					System.out.println("Enter Electrical Appliances/Snacks Unit Price");
					up=input.nextInt();
					
					System.out.println("Enter Electrical Appliances/Snacks Quantity");
					qty=input.nextInt();
					
					
					Item item=new Item();
					item.getData(Id, Des, up,qty);
					add(item);
					System.out.println("Electrical Appliances/Snacks added Successfully!!!");
					
					
					break;
				
			}
			case 2:
			{ 
				String Id;
				String Des;
				int up;
				double wt;
				System.out.print("Enter Fruits/Vegetables id:");
				Id=input.next();
				
				System.out.print("Enter Fruits/Vegetables Description:");
				Des=input.next();
				
				System.out.println("Enter Fruits/Vegetables Per Kg Price");
				up=input.nextInt();
				
				
				System.out.println("Enter Fruits/Vegetables weight in Kg");
				wt=input.nextDouble();
				
				
				Item item=new Item();
				item.getData(Id, Des, wt,up);
				add(item);
				System.out.println("Fruits/Vegetables added Successfully!!!");
				
				
				break;
				
			}
			case 3:{
				String eqId;
				System.out.print("Enter item id to remove:");
				eqId=input.next();
				remove(eqId);
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
