package codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p3 {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {
                //Take Input
                String[] input1 = br.readLine().split(" ");
                int N= Integer.parseInt(input1[0]);
                int K = Integer.parseInt(input1[1]);
                int endChar = 97+K-1;
                String actual = br.readLine();
                char arr[]=new char[N];
                char start[]=new char[N];
                for(int i=0;i<N;i++){
                    arr[i]=actual.charAt(i);
                    start[i]='a';
                }
                int selected=N-1;
                while(true){
                    start[selected]=(char)(start[selected]+1);
                    if(start[selected]>arr[selected]){
                        start[selected]=97;
                        selected--;
                    }
                    System.out.println(start);
                    if(selected==-1)
                        break;



                }




                //optional convert to int

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


    static boolean isPalindrome(String k)
    {
        int first=0;int last = k.length()-1;
        int flag=0;
        while(k.charAt(first)==k.charAt(last)){
            first=first+1;
            last=last-1;
            if(first==last || first+1==last){
                flag=1;
                break;
            }
        }
        if(flag==0)
            return false;
        else
            return true;
    }





}
