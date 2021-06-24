import java.util.ArrayList;
import java.util.List;

public class ArraylistMethods {
    
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);

        ArrayList<Integer> Secondary = new ArrayList<Integer>();
        Secondary.add(3);
        Secondary.add(4);
        Secondary.add(7);
        Secondary.add(0);
        Secondary.add(1);
        Secondary.add(7);

        //ensureCapacity?(int minCapacity) -Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
        arr.ensureCapacity(10);

      
  

        


        

    }

    static void printList(List<Integer> list)
    {
       list.forEach((integer)->{
           System.out.print(integer +" ");
       });
       System.out.println();
    }

}
