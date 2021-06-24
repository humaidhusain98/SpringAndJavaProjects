import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class streams
{

    public static void main(String args[])
    {
        //IntStream.of(Integer elements seperated by commar)
//        IntStream.of(1,2,3).map(i->(i*i+5)).forEach(x->System.out.println(x));

        //IntStream.range(int a -inclusive,int b - exclusive)
//        IntStream.range(1,4).map(i->(i*i+5)).forEach(x->System.out.println(x));

        //IntStream.rangeClosed(int a -inclusive,int b - inclusive)
//        IntStream.rangeClosed(1,3).map(i->(i*i+5)).forEach(x->System.out.println(x));

        //
//        IntStream stream = IntStream.iterate(3,i->i+3).limit(10);
//        stream.filter(x-> x%6==0).forEach(x-> System.out.println(x));
        String  inpf= "This is a sentenceAA!";
        String inp=inpf.toUpperCase();
        int flag=0;
        IntStream.range(0,inp.length()).map(x->{
            char kk=inp.charAt(x);
            return kk;
        }).filter(k->{if(k=='E' && flag==0)
        {
            return true;
        }
        else {
            return false;
        }
        }).forEach(k->System.out.println(((char)k)));




    }

}