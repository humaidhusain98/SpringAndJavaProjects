package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Caravans {
    public static void main(String[] args) {
      int k=0;
      try
      {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int T=Integer.parseInt(br.readLine());
            String[] arr;
            StringBuilder buffer=new StringBuilder();
            for(int t=1;t<=T;t++)
            {
                int N=Integer.parseInt(br.readLine());
                arr=br.readLine().split(" ");
                int[] num=new int[N];
                for(int i=0;i<N;i++)
                {
                    num[i]=Integer.parseInt(arr[i]);
                }
                buffer.append(solveEachTestCase(num,N)).append('\n');

            }
          System.out.print(buffer.toString());
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }

    }

    static int solveEachTestCase(int[] num,int size)
    {
        int i=0,j=1;
        int max=num[i];
        int count=1;
        while(j!=size)
        {
            if(num[i]>num[j] && max>num[j])
                count++;
            if(num[i]>max)
            {
                max=num[i];
            }
            i++;j++;
        }

        return count;
    }
}
