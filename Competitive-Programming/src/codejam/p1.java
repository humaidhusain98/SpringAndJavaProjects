package codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {
                //Take Input
                String input1 = br.readLine();
                int len = input1.length();
                int digitstaken=1;
                List<String> possibleoutcomes=new ArrayList<>();
                while(digitstaken<len)
                {

                    String num="";String initial=input1.substring(0,digitstaken);String newnum="";
                     while(num.length()<len || newnum.length()<len)
                     {
                         int no = Integer.parseInt(initial);
                         newnum = newnum+Integer.toString(no+1);
                         num=num+Integer.toString(no);
                         no++;
                         initial = Integer.toString(no);
                     }
                     possibleoutcomes.add(num);
                     possibleoutcomes.add(newnum);
                     digitstaken++;
                }
                System.out.println(possibleoutcomes);

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void  solve(String arr[],int N)
    {
        //Logic to solve each case
        System.out.println("Case");

    }


}
