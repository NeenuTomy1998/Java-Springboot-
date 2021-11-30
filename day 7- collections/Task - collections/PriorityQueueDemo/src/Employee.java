// Queue to store Car objects which the user enters.

import java.util.Iterator;
import java.util.PriorityQueue;


public class Employee {

    public static void main(String[] args) {
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

        //Adding Employee objects to pQueue

        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        System.out.println("Employee List : " + namePriorityQueue);


        // Using the peek() method
        String name = namePriorityQueue.peek();
        System.out.println("Accessed Employee Name :" + name);

        // Using the remove() method
        boolean result = namePriorityQueue.remove(2);
        System.out.println("Employee Removed or not :  " + result);

        // Using the poll() method
        String number = namePriorityQueue.poll();
        System.out.println("Removed Employee: " + number);

//using Iterator
        Iterator<String> iterate = namePriorityQueue.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print("  ");

        }
    }
}




