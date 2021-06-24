package begineerCodechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lue {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String k="";
        try {
            while ((k = br.readLine()) != null)
            {
                int num=Integer.parseInt(k);
                if(num==42)
                    break;
                System.out.println(num);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
