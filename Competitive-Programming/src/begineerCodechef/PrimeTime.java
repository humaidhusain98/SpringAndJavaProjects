package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeTime {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            int T=Integer.parseInt(br.readLine());
            for(int t=1;t<=T;t++)
            {
                List<Integer> inputs=new ArrayList<>();
                int N=Integer.parseInt(br.readLine());
                for(int n=0;n<N;n++)
                {
                    int num,times;
                    String line=br.readLine();
                    num=Integer.parseInt(line.split(" ")[0]);
                    times=Integer.parseInt(line.split(" ")[1]);
                    for(int i=0;i<times;i++)
                    {
                        inputs.add(num);
                    }
                }
//                System.out.println(inputs);
                Integer[] arr=new Integer[inputs.size()];
                 arr= inputs.toArray(arr);
                System.out.println("Case #"+t+": "+solve(arr, arr.length));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    static long solve(Integer[] prime,int N)
    {
        long totalsum=0;
        for(int i=0;i<N;i++)
        {
            totalsum=totalsum+prime[i];
        }
        List<Integer> productlist=new LinkedList<>();
        long product=1;long productsum=0;
        char[] arr;
        long maxproductsum=0;long productsumsum=0;
        long range=(int)Math.pow(2,N);long maxproduct=0;
        for(int i=0;i<range;i++)
        {
            arr=String.format("%"+N+"s",Integer.toBinaryString(i)).replace(" ","0").toCharArray();

            product=1;
            productsum=0;
            for(int k=0;k<N;k++)
            {
                if(arr[k]=='1')
                {
                    product=product*prime[k];
                    productsum=productsum+prime[k];
                }
            }
            productsumsum=product+productsum;
            if(productsumsum==totalsum) {
                if (productsumsum > maxproductsum) {
                    maxproductsum = productsumsum;
                    maxproduct=product;
                }
            }

        }

        return maxproduct;

    }

}
