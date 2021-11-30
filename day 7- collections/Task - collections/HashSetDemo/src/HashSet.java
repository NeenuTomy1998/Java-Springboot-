import java.util.*;

class HashSetDemo {

    // Main Method
    public static void main(String[] args)
    {
        HashSet<String> student = new HashSet<String>();

        // Adding elements
        student.add("Neenu Tomy");
        student.add("Amritha");
        student.add("Elsa");
        student.add("Jack");
        student.add("Neenu Tomy");// adding duplicate elements

        // Displaying the HashSet
        System.out.println(student);
        System.out.println("List contains Neenu or not:" + student.contains("Neenu Tomy"));

        // Removing items from HashSet
        student.remove("Elsa");
        System.out.println("List after removing Elsa:" + student);

        // Find the size of a HashSet
        System.out.println("Number of students in List " + student.size());


        // Iterating over hash set items
        System.out.println("=============Iterating list==========");
        Iterator<String> i = student.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        student.clear();
        System.out.println("After clear() => " + student);
    }
}