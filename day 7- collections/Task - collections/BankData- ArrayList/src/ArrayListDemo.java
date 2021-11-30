/*usecase : In Banking bank customer data is stored in Database. If manager wants to see all customer names .
I have written a code for databse to get all  the customer names and creating array obj to store all customer names
 into ArrayList and display */


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> customer =  new ArrayList<>();
        ArrayList<String> customer2 = new ArrayList<>(List.of("Elsa","Neethu","Tomy"))
        //Adding Names to ArrayList
        customer.add("Neenu Tomy");
        customer.add("Jack Richard");
        customer.add("Nithika Reshmi");
        customer.add("Sherin Joms");
        customer.add("Nimmy Alex");
        System.out.println("Updated Data : " +customer);
        customer.set(2, "Nithiya");
        customer2.addAll(customer2);
        System.out.println("New updated Data :" +customer);
        System.out.println(customer.contains("Neenu Tomy"));
        System.out.println(customer.get(3));
        System.out.println(customer.remove(2));
        System.out.println("New Values after Updation : " +customer);
        System.out.println(customer.indexOf("Jack"));
        Collections.sort(customer);
        System.out.println("Sorted values :" +customer);
        System.out.println(customer.size());
        System.out.println("Size : " +customer);
        System.out.println(customer.isEmpty());
        customer.clear();
        System.out.println(customer);

    }
}
