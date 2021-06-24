package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class appendsort {

    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T=Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {
                int N=Integer.parseInt(br.readLine());
                String[] arr=br.readLine().split(" ");
                System.out.println("Case #"+t+": "+count(arr,N));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    static long count(String[] arr,int N)
    {
        int flag;
        long len;
        long counter=0;
        String max=arr[0];
        String prev;    boolean prevgreater=false;
        for(int i=1;i<N;i++)
        {
            prev=arr[i-1];
            String curr=arr[i];
            long maxval=Long.parseLong(max);
            long prevval=Long.parseLong(prev);
            if(maxval<prevval) {
                maxval = prevval;
                max=prev;
            }
            flag=0;


            if(max.length()>=curr.length()) {
                len = curr.length();
            }
            else
                len=max.length();

            if(maxval>=Long.parseLong(curr))
                prevgreater=true;

            if(prevgreater)
            {
                for(int j=0;j<len;j++)
                {
                    int prevdig= max.charAt(j)-48;
                    int currdig= curr.charAt(j)-48;
                    if(prevdig>currdig)
                    {
                        flag=1;
                        break;
                    }
                    else if(prevdig<currdig)
                    {
                        break;
                    }

                    if(j==(len-1))
                    {

                        flag=1;
                    }
                }
                long dif;

                if(flag==1)
                {
                    dif=max.length()-curr.length();
                    dif++;
                    if(dif>0)
                        counter=counter+dif;
                }
                else {
                    dif=max.length()-curr.length();

                    String maxSubstring=max.substring(0,curr.length());
                    if(maxSubstring.equals(curr))
                        dif++;
                    if(dif>0)
                        counter=counter+dif;
                }

            }


        }
        return counter;
    }
}
