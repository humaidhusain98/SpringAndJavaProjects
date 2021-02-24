import java.util.Scanner;
import java.lang.Double; 

public class Triangle {
	int base;
	int height;
	
	
	
	//constructor
	public Triangle(int base, int height) {
	
		this.base = base;
		this.height = height;
	}
	//getArea() Function
	public double getArea() {
		return ((double)((base*height)/2));
	}
	
	
	//show() Function
	public void show() {
		System.out.println("Base of Triangle ="+base);
		System.out.println("Height of Triangle ="+height);
		System.out.println("Area of triangle ="+getArea());
	}
	
	//compare function
	public static void compare(Triangle t1,Triangle t2) {
		System.out.println();
		System.out.println("-------------Triangle t1 Dimensions----------");
		t1.show();
		System.out.println();
		
		System.out.println("-------------Triangle t2 Dimensions-----------");
		t2.show();
		System.out.println();
		
		//using compare function
		int cmp;
		cmp=Double.compare(t1.getArea(),t2.getArea());
		
		
		if(cmp>0) {
			System.out.println("Triangle t1 is larger");
		}
		else if(cmp<0) {
			System.out.println("Triangle t2 is larger");
		}
		
		else {
			System.out.println("Triangle t1 Area = Triangle t2 Area");

		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		  //creating object of Scanner class
        Scanner input = new Scanner(System.in);
        
        int tbase;
        int theight;
        System.out.print("Enter Triangle Base: ");
        tbase=input.nextInt();
        
        System.out.print("Enter Triangle Height: ");
        theight=input.nextInt();
        
        if(tbase>0 && theight>0) {
        Triangle triangle=new Triangle(tbase,theight );
        triangle.show();
        }
        else {
        	System.out.println("Error - base / height cannot be 0 or negative");
        }
        
        int choice;
        System.out.print("To compare two triangles press 1 ");
        choice=input.nextInt();
        
        if(choice==1) 
        {
        
        
        
        			int b1,h1,b2,h2;
        			System.out.print("Enter Triangle t1 base: ");
        			b1=input.nextInt();
        			System.out.print("Enter Triangle t1 height: ");
        			h1=input.nextInt();
        
        			System.out.print("Enter Triangle t2 base: ");
        			b2=input.nextInt();
        			System.out.print("Enter Triangle t2 height: ");
        			h2=input.nextInt();
        			
        			
        			
        			if(b1>0 && b2>0 && h1>0 && h2>0) {
        				
        			
        			Triangle t1=new Triangle(b1,h1 );
        			Triangle t2=new Triangle(b2,h2 );
        			compare(t1,t2); 
        			}
        			
        			else {
        				System.out.println("Error - base / height cannot be 0 or negative");
        			}
        		
        }
		
		
	}
	
}
