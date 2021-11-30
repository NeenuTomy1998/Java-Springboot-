import java.util.*;

public class FoodOrder {
    public static void main(String[] args) {
        ArrayDeque<String> bbqlLine = new ArrayDeque<String>();
        bbqlLine.add("Jackson");
        bbqlLine.add("Neenu");
        bbqlLine.add("susan");
        bbqlLine.add("Mark");
        bbqlLine.add("Steven");
        System.out.println("people in queue => " + bbqlLine);


        // Check if a Queue is empty
        System.out.println("is waitingQueue empty =>  : " + bbqlLine.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + bbqlLine.size());

        // Check if the Queue contains an element
        String name = "Johnny";
        if (bbqlLine.contains(name)) {
            System.out.println("WaitingQueue contains " + name);
        } else {
            System.out.println("Waiting Queue doesn't contain " + name);
        }
        //(The Dequeue operation)
        name = bbqlLine.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + bbqlLine);

        // Removing an element from the Queue using poll()

        name = bbqlLine.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + bbqlLine);



        System.out.println("\n=== Iterating over a Queue  ===");
        bbqlLine.forEach(System.out::println);
    }
}


