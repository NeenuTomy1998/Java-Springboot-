//real time example to add courses to coursera and remove , adding ,Getting and setting Items in the list .
import java.util.LinkedList;
import java.util.ListIterator;

public class Coursera {
    public static void main(String args[]) {


        LinkedList<String> obj = new LinkedList<String>();

         // the Items to the linked list
        obj.add("Java Tutorial");
        obj.add("Python Basics");
        obj.add("Scala Advanced Program");
        obj.add("Swift ");
        System.out.println("Content of course : " +obj);

        //Adding  Items at specified position
        obj.add(2, "JavaScript");
        obj.add(3, "Kotlin");
        System.out.println("Course Content after editing: " +obj);

        //Adding First and Last Item
        obj.addFirst("Java");
        obj.addLast("Google Cloud");
        System.out.println("Course Content after addition: " +obj);

        //Get and set Items in the list
        Object firstpos = obj.get(0);
        System.out.println("First Item: " +firstpos);
        obj.set(0, "Java9");
        System.out.println(" Content after updating first Item: " +obj);

       //Remove from a position
        obj.remove(1);
        obj.remove(2);
        System.out.println("Course List after deletion of Item in 2nd and 3rd position " +obj);

       //Remove first and last Item
        obj.removeFirst();
        obj.removeLast();
        System.out.println("Final Content after removing first and last Item: "+obj);


        ListIterator<String> iterator = obj.listIterator();
        System.out.println("Final List:");
        //for (iterator <String> Iterator = l_list.iterator();iterator.hasNext();){
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.next());


        }
    }
}