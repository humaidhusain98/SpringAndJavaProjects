package begineerCodechef;


import jdk.swing.interop.SwingInterOpUtils;

import java.math.BigInteger;
import java.util.*;

class Result {

    public static void main(String[] args) {
        List<String> test=new ArrayList<>();
        test.add("azbde");
        test.add("abcher");
        test.add("acegkd");
        System.out.println(solve(100,test));
    }
    public static String solve(int m, List<String> s) {
       BigInteger sum=new BigInteger("0");
       for(int i=0;i<s.size();i++)
       {
           String k=s.get(i);
           BigInteger product=new BigInteger("1");
           for(int j=0;j<k.length();j++)
           {
               int val=k.charAt(j);

               for(int l=0;l<m;l++)
               {
                  product=product.multiply(new BigInteger(Integer.toString(val)));

               }

           }
           sum= sum.add(product);
       }
        System.out.println(sum);
       if(sum.mod(new BigInteger("2")).equals(new BigInteger("0")))
            return "EVEN";
        else
            return  "ODD";
    }


}