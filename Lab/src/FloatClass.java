public class FloatClass {
	public static void main(String[] args) {
		float arr[]=new float[4];
		//taking input from command line
		 arr[0]=Float.parseFloat(args[0]);
		 arr[1]=Float.parseFloat(args[1]);
		 arr[2]=Float.parseFloat(args[2]);
		 arr[3]=Float.parseFloat(args[3]);
		 float sum=0;
		 bubbleSort(arr);
		 System.out.println();
		 for(int i=0;i<arr.length;i++) {
			 //using .format function
			 String str=String.format("%.2f", arr[i]);
			 System.out.print(str+", ");
			 sum=Float.sum(sum, Float.parseFloat(str));
			 
		 }
		 
		 String str=String.format("%.2f", sum);
		 System.out.println();
		 System.out.println(str);
		 
		}
	
	//sorting the array 
	static void bubbleSort(float arr[]) 
	    { 	int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	            	//using compare function
	                if (Float.compare(arr[j], arr[j+1])>0) 
	                { // swap arr[j+1] and arr[i] 
	                    float temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	    } 
	
}
