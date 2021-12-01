import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.List;


public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> mark=new LinkedHashSet<>();
        mark.add(40);
        mark.add(20);
        mark.add(42);
        mark.addAll(List.of(45,50));
        System.out.println("Total number of subjects : " + mark.size());
        System.out.println("Displaying the marks of subjects in order: "+ mark);
        mark.remove(40);
        System.out.println(" Does the student score 40 marks in any subject : " + mark.contains(40));
        System.out.println("Updated marksheet :"+ mark);
        mark.clear();
        System.out.println("Cleared marksheet :"+ mark);
    }
}