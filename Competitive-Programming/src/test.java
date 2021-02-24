import java.io.InputStream;
import java.util.Scanner;
import java.util.Arrays;

public class test {
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		

        // Write your code here.
  
    }
	
	
	static boolean isAnagram(String a, String b) {
        char[] word1=new char[a.length()];
        char[] word2=new char[b.length()];
        if(a.length()==b.length()) {
        	for(int i=0;i<a.length();i++) {
        		
        		char A=a.charAt(i);
        		char B=b.charAt(i);
        		if((int)(A)>=65 && (int)(A)<=90)
        			word1[i]=A;
        		else
        			word1[i]=(char)((int)(A)-32);
        		if((int)(B)>=65 && (int)(B)<=90)
        			word2[i]=B;
        		else
        			word2[i]=(char)((int)(B)-32);
        	}
        	 Arrays.sort(word1);
        	 Arrays.sort(word2);
        	 int flag=0;
        	 for(int i=0;i<a.length();i++) {
        		 if(word1[i]!=word2[i]) {
        			 flag=1;break;
        		 }
        			 
        	 }
        	 if(flag==0)
        		 return true;
        	 else {
				return false;
			}
        	
        }else {
			return false;
		}
        
		
    }
	
	
	
	
	
	
	
		
}
