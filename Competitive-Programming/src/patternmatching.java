import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class patternmatching {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int N=sc.nextInt();
            List<String> stringval=new ArrayList<>();
            for(int j=1;j<=N;j++)
            {
                String k =sc.next();
                stringval.add(k);
            }
            String maxpre = getMaximumPrefix(stringval, N);
            String maxpost = getMaximumPOSTFIX(stringval, N);
            String mid = getMidSum(stringval,N);
        

        }
        sc.close();
    }


    static void printData(List<String> val,int N)
    {
        System.out.println(N);
        for(int i=0;i<val.size();i++)
        {
            System.out.println(val.get(i));
        }
    }


    static String getMidSum(List<String> val,int N)
    {
        String mid="";
        for(int i=0;i<val.size();i++)
        {
            String subval=val.get(i);int count=0;
            for(int j=0;j<subval.length();j++)
            {
                if(count ==1 && subval.charAt(j)=='*')
                {
                    break;
                }
                if(count == 1)
                {
                    mid=mid+subval.charAt(j);
                }

                if(subval.charAt(j)=='*')
                {
                    count++;
                }
             

            }
        }
        return "";
    }

    static String getMaximumPrefix(List<String> val,int N)
    {
        String maxpre="";
       
        for(int i=0;i<N;i++)
        {
            String pre="";
            String value=val.get(i);
            for(int j=0;j<value.length();j++)
            {
                if(value.charAt(j)=='*')
                {
                    break;
                }
                else
                {
                    pre=pre+value.charAt(j);
                }
            }
            if(pre.length()>maxpre.length())
            {
                maxpre= pre;
            }
        }

        return maxpre;
    }

    static String getMaximumPOSTFIX(List<String> val,int N)
    {
        String maxpre="";
        for(int i=0;i<N;i++)
        {
            String pre="";
            String value=val.get(i);
            for(int j=value.length()-1;j>=0;j--)
            {
                if(value.charAt(j)=='*')
                {
                    break;
                }
                else
                {
                    pre=value.charAt(j)+pre;
                }
            }
            if(pre.length()>maxpre.length())
            {
                maxpre= pre;
            }
        }

        return maxpre;
    }
    
}
