import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cjjcprob
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int t=1;t<=T;t++)
        {
            int X =sc.nextInt();
            int Y =sc.nextInt();
            String inp =sc.next();
            int size = inp.length();
            char[] newString= inp.toCharArray();
           
            int jc=0,cj=0;
            if(X>Y)
            {
                //JC has more priority
                jc=1;
            }
            else if(Y<X)
            {
                //CJ has more priority
                cj=1;
            }
            else
            {
                //Both have same priority
                
            }
            List<Integer> Jlist =new ArrayList<>();
            List<Integer> Clist =new ArrayList<>();
            List<Integer> Qlist=new ArrayList<>();
      
            
            for(int i=0;i<size;i++)
            {
             if(inp.charAt(i)=='J')
                Jlist.add(i);
            else if(inp.charAt(i)=='C')
                Clist.add(i);
            else 
                Qlist.add(i);
            }
            //create string
            
            for(int i=0;i<Qlist.size();i++)
            {
                int val=Qlist.get(i);
                if(val==0)
                {
                    int rightval=1;
                    while(inp.charAt(rightval)=='?')
                    {
                        rightval++;
                    }
                    for(int j=0;j<rightval;j++)
                    {
                        Qlist.remove(0);
                        newString[j]=inp.charAt(rightval);
                    }
                }
                else if(val==(size-1))
                {
                    int leftval=size-2;
                    while(inp.charAt(leftval)=='?')
                    {
                        leftval--;
                    }
                    for(int j=leftval;j<=val;j++)
                    {
                        newString[j]=inp.charAt(leftval);
                    }
                }
                else
                {
                    int leftval=val-1;
                    int rightval=val+1;
                    while(inp.charAt(leftval)=='?')
                    {
                        leftval--;
                    }
                    while(inp.charAt(rightval)=='?')
                    {
                        rightval++;
                    }
                    for(int j=leftval;j<=rightval;j++)
                    {
                            newString[j]=inp.charAt(leftval);
                    }
                   
                }


            }//for loop

           

            System.out.println(newString);

            }

            
        }
   
   
 }

    

