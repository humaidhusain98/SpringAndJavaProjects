package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class payingUp {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T=Integer.parseInt(br.readLine());
            StringBuilder buffer=new StringBuilder();
            for(int t=1;t<=T;t++)
            {
                String[] nm=br.readLine().split(" ");
                int N=Integer.parseInt(nm[0]);
                int M=Integer.parseInt(nm[1]);
                int[] num=new int[N];
                for(int n=0;n<N;n++)
                {
                    num[n]=Integer.parseInt(br.readLine());
                }
                buffer.append(solve(num,N,M)).append('\n');
            }
            System.out.println(buffer.toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }

    static String solve(int[] num,int size,int M)
    {
        List<Integer> elements=new LinkedList<Integer>();
        for(int i=0;i<size;i++)
        {
            if(num[i]<M)
            {
                elements.add(Integer.valueOf(num[i]));
            }
            if(num[i]==M)
                return "Yes";
        }
        Collections.sort(elements,Collections.reverseOrder());
        int copy=M;
        int maxval=(int)Math.pow(2,elements.size())-1;
        char[] arr;
        for(;maxval>=0;maxval--)
        {
            arr=String.format("%"+elements.size()+"s",Integer.toBinaryString(maxval)).replaceAll(" ","0").toCharArray();
            int sum=0;
            for(int k=0;k<elements.size();k++)
            {
                if(arr[k]=='1')
                {
                    sum=sum+elements.get(k);
                }
            }
            if(sum==M)
                return "Yes";
        }


        return "No";
    }

}
