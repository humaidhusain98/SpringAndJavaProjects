package codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2 {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {
                //Take Input
                String[] input1 = br.readLine().split(" ");
                //optional convert to int
                solve(input1,5);
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
