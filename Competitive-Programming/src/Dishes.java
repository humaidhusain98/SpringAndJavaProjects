

import java.util.*;



 


class Dishes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T,N,t,n;
		T=sc.nextInt();t=0;
		while(t<T) {
			N=sc.nextInt();
			int arr[]=new int[N];n=0;
			
			while(n<N) {
				arr[n]=sc.nextInt();
			n++;	
			}
			n--;
			Arrays.sort(arr);
			int sum1=0;int sum2=0;
			while(n!=-1) {
				if(sum1>=sum2) {
					sum2=sum2+arr[n];
				}
				else {
					sum1=sum1+arr[n];
				}
				n--;
			}
			
			if(sum1>=sum2)
				System.out.println(sum1);
			else {
				System.out.println(sum2);
			}
			  
			
			
			
			t++;
		}
		
		
			
		
		
	}
}
