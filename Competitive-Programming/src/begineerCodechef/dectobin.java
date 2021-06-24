package begineerCodechef;

import java.lang.Math;

class dectobin {

    // driver code
    public static void main(String args[])
    {

        char arr[];
        int maxval=((int)Math.pow(2,10));
        for(int i=0;i<maxval;i++)
        {
             arr= String.format("%10s",Integer.toBinaryString(i)).replaceAll(" ","0").toCharArray();


        }
    }



}