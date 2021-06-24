package DSAinJava;
import java.util.*;
import java.util.LinkedList;
import java.util.function.IntFunction;

public class linkedlistMethods {
    


    public static void main(String args[])
    {
        List<Integer> list1 = new LinkedList<Integer>();

        //isEmpty()
        list1.isEmpty();
        
        //add entity/object method
        list1.add(5);

        //add(int index, E element)
        list1.add(0,10);

        //get()
        int num = list1.get(0);
        
        //addAll(int index, Collection<E> c)
        List<Integer> Secondary = new ArrayList<Integer>();
        Secondary.add(99);
        Secondary.add(99);
        Secondary.add(55);
       
        list1.addAll(1, Secondary);


        //clear()
        list1.clear();

        //addAll(Collection<E> c) use this to clone too
        list1.addAll(0,Secondary);
        list1.addAll(1,Secondary);

       //clone very complex and not working
        

       //contains(Object o)
        boolean resp = list1.contains(22);

        //descendingIterator()
        Iterator i= ((LinkedList<Integer>) list1).descendingIterator();

        //element()-gives first element
        int xx = ((LinkedList<Integer>) list1).element();
       

        //getFirst() & getLast()
        ((LinkedList<Integer>) list1).getFirst();
        ((LinkedList<Integer>) list1).getLast();

        //indexOf(Object o) returns -1 if not present and gives first index
        int firstindex =list1.indexOf(99);
       

        //lastIndexOf(Object o)
        int lastindex =list1.lastIndexOf(28);

        //listIterator(int index)
        Iterator itr = list1.listIterator(2);

        //offer(E e) adds tail element to the list
        ((LinkedList<Integer>) list1).offer(14);
      

        //offerFirst(E e) inserts at the front
        ((LinkedList<Integer>) list1).offerFirst(22);

        //peek() -throws null point exception in list
        int peek = ((LinkedList<Integer>) list1).peek(); 

        //peekFirst() && peekLast() -throws null if empty
        try
        {
            int peekfirst = ((LinkedList<Integer>) list1).peekFirst(); 
            // System.out.println(peekfirst);
        }
        catch(NullPointerException npEx)
        {   
            //DO something for exception
            // System.out.println("The linked list is empty");
        }

        //pop() - pops the last element--This method Pops an element from the stack represented by this list. it is removing the element at the start of the list
        ((LinkedList<Integer>) list1).pop();
      

        //push(E e) 	This method Pushes an element onto the stack represented by this list. adds the element at the start 
        ((LinkedList<Integer>) list1).push(222);

        //remove() -	This method retrieves and removes the head (first element) of this list.
        ((LinkedList<Integer>) list1).remove();
     
        //remove(int index)
        ((LinkedList<Integer>) list1).remove(2);
       
        //remove(Object o) -	This method removes the first occurrence of the specified element from this list, if it is present
        ((LinkedList<Integer>) list1).remove(Integer.valueOf(99));
        
        //removeFirst()  -	This method removes and returns the first element from this list.
        int rfval = ((LinkedList<Integer>) list1).removeFirst();
      
        //removeLast()
        int rlval = ((LinkedList<Integer>) list1).removeLast();

        //set(int index, E element) -sets the value at the specified index
        ((LinkedList<Integer>) list1).set(1,Integer.valueOf(999));
       
        //size() returns the no of elements
        list1.size();

        //spliterator() -	This method Creates a late-binding and fail-fast Spliterator over the elements in this list.
            // Getting Spliterator
	        Spliterator<Integer> list1Spliterator = list1.spliterator();
            list1Spliterator.forEachRemaining(xxy-> {
                //TODO for each element xxy code spliterator is very fast   
                // System.out.println(xxy);
            });	

        //toArray() - 	This method returns an array containing all of the elements in this list in proper sequence (from first to last element).
        Object[] array = list1.toArray();

        // toArray(T[] a) - 	This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
        Integer[] array1 = new Integer[list1.size()];
        array1 = list1.toArray(array1);
    
        //toString() -	This method returns a String containing all of the elements in this list in proper sequence (from first to last element), each element is separated by commas and the String is enclosed in square brackets
        String tostring = list1.toString();

        //indexOf(Object o)
        int indexof = list1.indexOf(Integer.valueOf(55));

        //lastIndexOf
        int lastindexof = list1.lastIndexOf(Integer.valueOf(55));
       
        
       //retainAll(Collection<?> c)
       list1.retainAll(Secondary);

       //iterator()
       Iterator iterator = list1.iterator();

       //subList(int fromIndex,int toIndex)
       List<Integer> sublist = list1.subList(0, 1);
     
        
        

    }
    
    static void printList(List<Integer> list)
    {
       list.forEach((integer)->{
           System.out.println(integer);
       });
    }

    static void printArray(Object[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }


}
