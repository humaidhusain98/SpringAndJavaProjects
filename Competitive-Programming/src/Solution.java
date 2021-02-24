import java.util.regex.Matcher;
import java.util.*;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

 class MyRegex{
  String pattern="[^a-zA-z3-9][^a-zA-z6-9][^a-zA-z6-9][.][^a-zA-z3-9][^a-zA-z6-9][^a-zA-z6-9][.][^a-zA-z3-9][^a-zA-z6-9][^a-zA-z6-9][.][^a-zA-z3-9][^a-zA-z6-9][^a-zA-z6-9]";
}