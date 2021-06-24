package testcasegen;


import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class testCaseGen {
    public static void main(String[] args) {
        File file = new File("src/testcasegen/test.txt");
        Random rand = new Random();
        try
        {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("1000\n");
            for(int t=0;t<1000;t++)
            {
                int N=rand.nextInt(100);
                while(N<=0)
                    N=rand.nextInt(100);
               int M=rand.nextInt(1000);
               writer.write(N+" "+M+"\n");
               for(int n=1;n<=N;n++)
               {
                   int k= rand.nextInt(1000000);
                   writer.write(k+" ");
               }
               writer.write("\n");
            }
            writer.flush();
            writer.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
