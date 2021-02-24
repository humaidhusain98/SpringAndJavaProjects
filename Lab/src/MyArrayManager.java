import java.util.Scanner;

public class MyArrayManager
{
	
	static int top=-1;
	
	
	
	
    public static void main(String[] args)
    {
        int choice;
        int[ ] array = new int[11];
        // create a Scanner object here
        Scanner scanner=new Scanner(System.in);
        
        
        do {
        	System.out.println("Perform the following methods:");
        	System.out.println("1: initialize");
        	System.out.println("2: insert");
        	System.out.println("3: remove");
        	System.out.println("4: display");
        	System.out.println("5: quit");
        	
        	choice=scanner.nextInt();

        	// read user input
        	switch (choice)
        	{
        	case 1: {
        			//initializing 
        			int n;int input;
        			System.out.println("Enter Number of elements");
        			n=scanner.nextInt();
        			for(int i=0;i<n;i++) {
        				System.out.println("Enter "+(i+1)+" Element");
        				input=scanner.nextInt();
        				insert(array, input);
        			}
        			bubbleSort(array);
        			break;
        			}
        	case 2: { 	//implementing insert
        				int number;
        				System.out.println("Enter Number to insert into Array");
        				number=scanner.nextInt();
        				insert(array, number);
        				break;
        			}
        		
        	case 3: {	int number;
						System.out.println("Enter Number to remove from Array");
						number=scanner.nextInt();
        				remove(array, number);
        				break;
        			}
        		
        	case 4: {/* add display() call */
        				display(array);
        				break;
        			}
        	
        	case 5: System.out.println("Program terminating ….");
        		break;
        	default: /* add error handling */
        		break;
        	}//switch case ended here
        } while (choice != 5);//do while ended here
        
    }//main method ended
/* add method code */
    
    //initialize method
    public static void initialize(int [] ar) {
    	
    }
   
    
    
    
    
    //add method
    public static void insert(int []ar,int A) {
    	if (top>=10) {
    		System.out.println("Cannot insert.Array out of size!!!");
    		
    	}
    	else
    		{
    		top=top+1;
		 	ar[top]=A;
    		}
	 }
    
    
    //remove method
    public static void remove(int []ar,int val) {
		 for(int i=0;i<=top;i++) {
			 if(ar[i]==val) {
				 ar[i]=-999999;
				 break;
			 }
				 
		 }
	 }
    
    //display method
    public static void display(int [] ar) {
		 System.out.println("--------------------Elements in the Array----------------");
		 
		 for(int i=0;i<=top;i++) {
			 if(ar[i]!=-999999) {
			 System.out.println(ar[i]);
			 
			 }
		 }
		 
	 }
    
    //bubble sort sorting method
    static void bubbleSort(int arr[]) 
    { 	int n = top+1; 
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++) 
            {
            	
                if (arr[j]>arr[j+1]) 
                { // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }//inner for loop
            
        }//outer for loop
    } 
}