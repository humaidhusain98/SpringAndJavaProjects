import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileInputStream inputStream=null;
		try 
		{
			File file=new File("/home/hacker/Desktop/arr[n]");
			inputStream=new FileInputStream(file);
			int content;
			while((content = inputStream.read())!=-1) 
			{
				
				System.out.print((char)content);
				
			}
			
		}
		catch(Exception e)
		{
			
			
		}
		finally 
		{
			
			try
			{	if(inputStream!=null) 
				{
				inputStream.close();
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
