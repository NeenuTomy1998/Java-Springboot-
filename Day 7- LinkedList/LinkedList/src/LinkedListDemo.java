

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

     public static void main(String[] args) {


        LinkedList<String> company = new LinkedList<>();

        company.add("Godaddy");
        company.add("BlueHost");
        company.add(1, "Hostinger");

        System.out.println("Initial LinkedList " + company);

        company.set(1, "Liquidweb");

        System.out.println("Updated LinkedList " + company);


        company.remove(0);
        System.out.println("Updated LinkedList after removing" + company);

        company.forEach(name -> System.out.println(company));

        for (int i = 0; i < company.size(); i++) {
            System.out.println(company.get(i));
        }
        System.out.println(company.lastIndexOf("Google"));
        for (Iterator<String> iterator = company.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        company.addLast("IBS");
        company.set(1, "UST");
        System.out.println("updated Linkedlist " + company);
    }
}