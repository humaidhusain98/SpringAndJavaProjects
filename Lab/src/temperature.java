import java.util.Scanner;

public class temperature  
 {  
   public static void main (String args[])  
    { 		Scanner scanner=new Scanner(System.in);
    
	   		float Fahrenheit, Celsius;  
	   		
	   		System.out.println("Enter Temperture in Celsius : ");
	   		Celsius=scanner.nextFloat();
       
	   		Fahrenheit =((Celsius*9)/5)+32;  
	   		
	   		System.out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
    }
   
 
 }  
