package LabExamQ3;

import java.util.Scanner;
import java.util.regex.Pattern;


public class BillingManager {

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
	 
	 
	 
		public static void main(String[] args) {
			
			Scanner input= new Scanner(System.in);
			
			while(true) {
				int choice;
				System.out.println();
				System.out.println("Press 1 For adding a Food item");
				System.out.println("Press 2 For Removing a FoodItem specified by its Id ");
				System.out.println("Press 3 To Generate the Bill along with discounts ");
				System.out.println("Press 4 checkout ");
				choice=input.nextInt();
				if (choice==4)
					break;
				switch(choice) {
				case 1:
				{ 		Pattern pattern=Pattern.compile("\\s*");
						String Id;
						String Des;
						int up,qty,time,type,dinein;
						boolean din;
						System.out.print("Enter Food-Item Id:");
						Id=input.next();
						
						System.out.print("Enter Food-Item Description:");
						input.skip(pattern);
						Des=input.nextLine();
						
						System.out.println("Enter Food-Item Unit Price");
						up=input.nextInt();
						
						System.out.println("Enter Food-Item Quantity");
						qty=input.nextInt();
						
						System.out.println("Enter Time in Hour Military Time");
						time=input.nextInt();
						
						System.out.println("Enter Food-Item Type:"
								+"\n1 for Combo \n2 for lunch-time \n3 for hot drink \n4 for slice of cake ");
						type=input.nextInt();
						
						System.out.println("Enter 1 for DineIn \nEnter any other value Take Away");
						dinein=input.nextInt();
						if(dinein==1)
							din=true;
						else {
							din=false;
						}
						
						
						
						
						
						
						Item item=new Item(Id,Des,qty,up,time,type,din);
						add(item);
						System.out.println("Food-Item added Successfully!!!");
						
						
						break;
					
				}
				case 2:
				{ 
					String eqId;
					System.out.print("Enter Food-Item id to remove:");
					eqId=input.next();
					remove(eqId);
					break;
				}
				case 3:{
					int discountComboAvailed=0,LunchTotal11to3=0,discountTeaTimeAvailed3to5=0;
					int discLunch=0,discCombo=0,discTeaTime=0,discTakeaway=0,ordertotal=0;
					double takeawaytot=0.0;
					System.out.println("----Id-----------------------Food Item Description---------------------Unit Price ------------Quantity--------------TotalPrice");
					Item prevItem=null;
					Item drinkOrCakeItem=null;
					for(int i=0;i<=top;i++) 
					{
						if(listItems[i].getId()!=null && listItems[i].isDineIn()) 
						{
							System.out.printf("\n%5s                         %-20s              %7d                      %2d                  %7d",listItems[i].getId(),listItems[i].getDescription(),listItems[i].getUnitPrice(),listItems[i].getQty(),(listItems[i].getUnitPrice()*listItems[i].getQty()));
							ordertotal=ordertotal+listItems[i].getUnitPrice()*listItems[i].getQty();
									
									
							if(listItems[i].getType()==1 && discountComboAvailed==0) 
							{
								if(listItems[i].getQty()>=2 )
								{
									discCombo= Discount(listItems[i]);
									discountComboAvailed=1;
								}
								else 
								{	if(prevItem==null)
										{prevItem=listItems[i];}
									else {
										discCombo=Discount(prevItem,listItems[i]);
										discountComboAvailed=1;
									}
									
									
								}//single item case of combo
								
								
							}//if Calculating total Discount
							else if(listItems[i].getType()==2 && listItems[i].getOrder_timehr()>=11 && listItems[i].getOrder_timehr()<=15) 
							{
								LunchTotal11to3=LunchTotal11to3+listItems[i].getUnitPrice()*listItems[i].getQty();
								
							}//Calculating Lunch Time total
							else if((listItems[i].getType()==3 || listItems[i].getType()==4) && listItems[i].getOrder_timehr()>=15 && listItems[i].getOrder_timehr()<=18 && discountTeaTimeAvailed3to5==0)
							{
								if(drinkOrCakeItem==null)
									drinkOrCakeItem=listItems[i];
								else {
									discountTeaTimeAvailed3to5=1;
									discTeaTime=Discount(drinkOrCakeItem, listItems[i], 1);
								}
										
								
								
							}//Calculating Tea and Cake Discount
							else {
								//do nothing
								
							}
							
							
							
							
						}//first if
						else
						{
							if(listItems[i].getId()!=null) 
							{	System.out.printf("\n%-5s                           %-20s                     %-7d                      %-2d                  %-7d",listItems[i].getId(),listItems[i].getDescription(),listItems[i].getUnitPrice(),listItems[i].getQty(),(listItems[i].getUnitPrice()*listItems[i].getQty()));
								takeawaytot=takeawaytot + listItems[i].getUnitPrice()*listItems[i].getQty();
								ordertotal=ordertotal+listItems[i].getUnitPrice()*listItems[i].getQty();
								
							}//condition for takeaway here calculating takeaway total
							
							
						}//else
						
					}//for loop
					
					discLunch=Discount(LunchTotal11to3);
					discTakeaway=Discount(takeawaytot);
					
					System.out.printf("\n%-60s %-10d","Order Total = ",ordertotal);
					System.out.printf("\n%-60s %-10d","Combo Discount Total = ",discCombo);
					System.out.printf("\n%-60s %-10d","Lunch Time Discount Total = ",discLunch);
					System.out.printf("\n%-60s %-10d","Tea and Cake Discount Total = ",discTeaTime);
					System.out.printf("\n%-60s %-10d","Take-Away Discount Total = ",discTakeaway);
					int totafterdiscounts=ordertotal-discCombo-discLunch-discTeaTime-discTakeaway;
					System.out.printf("\n%-40s %-10d","Order Net Total after applying Discounts = ",totafterdiscounts);
					System.out.println();
					break;
					
				}//case 3
				
				
					}//while loop					
			}//switch case
			
		}//main
		//Overloaded Methods Below
		//Discounting Combo for single item with qty=2 or greater than 2
		public static int Discount(Item A) 
		{
			return A.getUnitPrice();
		}
		//Discounting Combo with price of lower pizza both having qty =1
		public static int Discount(Item A,Item B) 
		{
			if (A.getUnitPrice()>=B.getUnitPrice())
				return B.getUnitPrice();
			else {
				return A.getUnitPrice();
			}
		}
		//Discounting lunch time Discount
		public static int Discount(int totallunchbill) 
		{
			return (totallunchbill/10);//10 percent on all items	
		}
		//Discounting on 1 hot drink and 1 slice of cake
		public static int Discount(Item A,Item B,int C) 
		{
			return (A.getUnitPrice()+B.getUnitPrice()-200);
		}
		//15 % Discounting on takeaway
		public static int Discount(double tottakeaway) 
		{
			return (int)(tottakeaway*.15);	
		}  
}
