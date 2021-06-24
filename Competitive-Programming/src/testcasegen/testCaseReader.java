package testcasegen;

import java.io.BufferedReader;
import java.io.FileReader;

public class testCaseReader {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("src/testcasegen/test.txt"));
            String line;
            while((line=br.readLine())!=null)
            {

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


