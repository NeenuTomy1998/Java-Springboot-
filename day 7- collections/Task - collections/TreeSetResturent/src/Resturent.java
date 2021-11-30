import java.util.Iterator;
import java.lang.String;
import java.util.TreeSet;

public class Resturent {
    public static void main(String[] args) {
        TreeSet<String> set =new TreeSet<String>();

        // Elements are added
        // using add() method
        set.add("Biriyani");
        set.add("Chappati");
        set.add("chicken");
        set.add("vegitableCury");
        set.add("salad");
        set.add("beef curry");

//initial elements of TreeSet
        System.out.println("Initial Menu :  " + set);

        // Removing a specific existing element inserted

        set.remove("Biriyani");

        // Printing the updated TreeSet
        System.out.println("After removing Items " + set);


        // using pollFirst() method - first element
        set.pollFirst();


        System.out.println("After removing first item " + set);

        // Removing the last Item

        set.pollLast();
        System.out.println("After removing last " + set);

        System.out.println("Traversing element through Iterator in descending order");
        Iterator i=set.descendingIterator();
    }



}




