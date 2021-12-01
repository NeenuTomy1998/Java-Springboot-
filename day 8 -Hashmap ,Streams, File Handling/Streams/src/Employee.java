import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        System.out.println("Names in the list :" +memberNames);
        System.out.println(" =========filter elements =========");
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .forEach(System.out::println);
        System.out.println("==============Sorting Elements============");
        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("==========Element start with A and prints boolean value if present");
        boolean matchedResult = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));
        System.out.println(matchedResult);
        System.out.println("======number of elements in the stream with 'A'=====");
        long totalMatched = memberNames.stream()
                .filter((s) -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);
        System.out.println("======Elements after limit operation===========");

        memberNames.stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("====================Elements after skip function=========================");
        memberNames.stream()
                .skip(5)
                .forEach(System.out::println);

        System.out.println("=======================FindFist function====================================");
        memberNames.stream()
                .findFirst();


    }
}