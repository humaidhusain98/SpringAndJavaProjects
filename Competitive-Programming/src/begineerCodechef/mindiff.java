package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class mindiff {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.valueOf(br.readLine());
            for(int t=1;t<=T;t++)
            {
                int N=Integer.valueOf(br.readLine());
                String[] arr = br.readLine().split(" " );
                int[] intArr = new int[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    String num = arr[i];
                    intArr[i] = Integer.parseInt(num);
                }
                Arrays.sort(intArr);
                int mindif=1000000000;
                for(int i=0;i<N-1;i++)
                {
                    int dif=intArr[i+1]-intArr[i];
                    if(dif<mindif)
                        mindif=dif;
                }
                System.out.println(mindif);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
