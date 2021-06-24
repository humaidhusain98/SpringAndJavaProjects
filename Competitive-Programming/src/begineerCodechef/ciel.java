/* package codechef; // don't place package name! */
package begineerCodechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ciel
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner scanner = new Scanner(System.in);
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            int realSol = n1 - n2;
            int index = 0;
            while(true) {
                if (getIndexEl(realSol, index) != 0) {
                    if(realSol - (int) Math.pow(10, index) == 0){
                        realSol = realSol + (int) Math.pow(10,index);
                    }else {
                        realSol = realSol - (int) Math.pow(10,index);
                    }
                    System.out.println(realSol);
                    break;
                }
                index++;
            }
        }catch(Exception e){
            return;
        }
    }
    public static int getIndexEl(int number,int index){
        number = (int) Math.floor(number / (int) Math.pow(10, index));
        int digit = number % 10;
        return digit;
    }
}
