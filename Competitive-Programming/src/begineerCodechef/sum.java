package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;

public class sum {

    public static void main(String[] args) {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {

                int N=Integer.parseInt(br.readLine());
                long sum=0;
                int k=0;
                String num="";
                String line= br.readLine();
                Reader r =new StringReader(line);
                while((k= r.read())!=-1)
                {
                    if(k==' ')
                    {
                        sum=sum+Long.parseLong(num);
                        num="";
                    }
                    else{
                        num=num+((char)k);
                    }
                }
                sum=sum+Long.parseLong(num);


                if(sum%2==0)
                    System.out.println(1);
                else
                    System.out.println(2);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
