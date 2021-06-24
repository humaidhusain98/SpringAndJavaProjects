package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Postfix {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{

            short T=Short.parseShort(br.readLine());
            String line;
            StringBuffer buff=new StringBuffer();
            for(short t=1;t<=T;t++)
            {
                line=br.readLine();
                char[] ch=line.toCharArray();
                buff.append(ConvertPostfix(ch,0,ch.length-1));

            }
            System.out.println(buff);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    static String ConvertPostfix(char[] str,int brstart,int brend)
    {
        boolean operatorFound=false;
        int firstlef,firstright,secondlef,secondright,opindex;
        char opvalue;opvalue=' ';int countfirst=0,countsecond=0;
        String first="",second="",last="";
        for(int i=brstart+1;i<brend;i++)
        {
            //for first operand
            if(str[i]=='(')
            {

                firstlef=i;
                first=first+str[i];
                while(true)
                { if(str[i]=='(')
                    countfirst++;

                  if(str[i]==')')
                        countfirst--;
                  if(countfirst==0 && str[i]==')')
                      break;
                    i++;
                first=first+str[i];
                }
                firstright=i;
                i++;//passing through last bracked

            }
            else {
                firstlef=i;
                first=first+str[i];
                firstright=i;
                i++;//passing the first num
            }
            opindex=i;
            opvalue=str[i];
            i++;
            if(str[i]=='(')
            {
                secondlef=i;
                second=second+str[i];
                while(true) {
                    if(str[i]=='(')
                        countsecond++;

                    if(str[i]==')')
                        countsecond--;
                    if(countsecond==0 && str[i]==')')
                        break;
                    i++;
                    second=second+str[i];
                }
                secondright=i;
                i++;//passing through last bracked

            }
            else {
                secondlef=i;
                second=second+str[i];
                secondright=i;
                i++;//passing the first num
            }
            if(firstlef!=firstright)
                first=ConvertPostfix(str,firstlef,firstright);
            if(secondlef!=secondright)
                second=ConvertPostfix(str,secondlef,secondright);
        }
        return (first+second+opvalue);
    }

}
