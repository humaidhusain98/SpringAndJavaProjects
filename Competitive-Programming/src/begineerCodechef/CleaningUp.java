package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CleaningUp {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String[] line;
            short T=Short.parseShort(br.readLine());
            StringBuffer buff = new StringBuffer();
            for(short i=1;i<=T;i++)
            {
                line=br.readLine().split(" ");
                short N=Short.parseShort(line[0]);
                short M=Short.parseShort(line[1]);
                char[] arr =new char[N];
                line=br.readLine().split(" ");
                for(short k=1;k<=M;k++)
                {
                    arr[Integer.parseInt(line[k-1])-1]='-';
                }
                boolean firstChance=true;
                for(short k=0;k<N;k++)
                {
                    if(arr[k]!='-')
                    {
                        if(firstChance==true)
                        {
                           arr[k]='1';
                           firstChance=false;
                        }
                        else
                        {
                            arr[k]='2';
                            firstChance=true;
                        }
                    }
                }
                for(short k=0;k<N;k++)
                {
                    if(arr[k]=='1')
                        buff.append((k+1)).append(' ');
                }
                buff.append('\n');
                for(short k=0;k<N;k++)
                {
                    if(arr[k]=='2')
                        buff.append((k+1)).append(' ');
                }
                buff.append('\n');



            }
            System.out.println(buff.toString());

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }
}
