package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class UncleJohnny {

    public static void main(String[] args) {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T = Integer.parseInt(br.readLine());
            int k=0;
            for(int t=1;t<=T;t++)
            {
//
                String num="";
                int N=Integer.parseInt(br.readLine());
                Long[] arr=new Long[N];
//                String[] arrstring=br.readLine().split(" ");
//                for(int i=0;i<N;i++)
//                {
//                    arr[i]=Long.parseLong(arrstring[i]);
//                }
                int count=0;
                while(true)
                {
                    k= br.read();
                    if(k=='\n' || k==' ')
                    {
                        if(num.equals(""))
                            break;

                        arr[count]=Long.parseLong(num);
                        num="";
                        count++;
                    }
                    else {
                        num=num+((char)k);
                    }
                    if(k=='\n')
                        break;
                }//while loop

                int K=Integer.parseInt(br.readLine());
                long value=arr[K-1];
                Arrays.sort(arr);
                for(int n=0;n<N;n++)
                {
                    if(arr[n].equals(Long.valueOf(value)))
                    {
                        System.out.println((n+1));
                        break;
                    }
                }


            }//for loop

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
