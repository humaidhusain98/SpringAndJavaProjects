package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class coinflip {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            short t,G,g,i,n,j;
            int I,N,Q,count;
            short T=Short.parseShort(br.readLine());
            for(t=1;t<=T;t++)
            {
                G= Short.parseShort(br.readLine());
                for(g=1;g<=G;g++)
                {
                    I=(br.read()-48);
                    br.read();
                    N=(br.read()-48);
                    br.read();
                    Q=(br.read()-48);
                    br.read();
                    count = solveProblem(I,N,Q);
                    System.out.println(count);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static int solveProblem(int i, int n, int q){
        if(n%2==0){
            return n/2;
        }
        else{
            int ans = (int) n/2;
            if(i==q){
                return ans;
            }else{
                return ans +1;
            }
        }
    }
}
