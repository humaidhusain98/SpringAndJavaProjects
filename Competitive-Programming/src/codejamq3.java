import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class codejamq3
{

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            //input taken
            long W,N;
            W=sc.nextLong();
            N=sc.nextLong();
            List<Long> locklist=new ArrayList<>();
            for(int i=1;i<=W;i++)
            {
                long val=sc.nextLong();
                locklist.add(val);
            }
            Collections.sort(locklist);
            //process this data
            BigInteger gloabalMinima=new BigInteger("100000000000000");
            for(long index=0;index<locklist.size();index++)//this for needs to be converted to binary search traversal
            {
                long i=locklist.get((int)index);
                BigInteger localMinima=new BigInteger("0");
                for(long j=0;j<W;j++)
                {
                   
                   long a =locklist.get((int) j);
                   if((gloabalMinima.compareTo(localMinima)<0))
                    {
                        break;
                    }
                   if(i>a)
                   {
                       
                       long min;
                       if((i-a)<((N-i)+a))
                        {
                            min=i-a;
                        }
                        else
                        {
                            min=N-i+a;
                        }
                        localMinima=localMinima.add(new BigInteger(String.valueOf(min)));
                      
                   }
                   else
                   {
                    
                    long min;
                    if((a-i)<((N-a)+i))
                     {
                         min=a-i;
                     }
                     else
                     {
                         min=(N-a)+i;
                     }
                     localMinima = localMinima.add(new BigInteger(String.valueOf(min)));
                   
                   }
                   

                }

                if((gloabalMinima.compareTo(localMinima)>0))
                {
                    gloabalMinima=localMinima;
                }

            }//for loop to be changed to while binary search
            System.out.println("Case #"+t+": "+gloabalMinima);

            

        }

        sc.close();
    }//main


}