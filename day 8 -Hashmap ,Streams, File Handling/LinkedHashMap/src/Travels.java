
import java.util.LinkedHashMap;
import java.util.Map;

public class Travels {
    public static void main(String[] args) {

        Map<Integer, String> vechicles = new LinkedHashMap<Integer, String>();
        vechicles.put(3, "car");
        vechicles.put(5, "bus");
        vechicles.put(7, "nano");
        vechicles.put(9, "innova");
        vechicles.put(10, "Benz");
        vechicles.put(12, "Audi");
        System.out.println("===========Welcome to JTravels===============");
        System.out.println("Modification Before" + vechicles);
        System.out.println("Vehicles exists: " + vechicles.containsKey(3));
        System.out.println("vehicle innova Exists: " + vechicles.containsValue("innova"));
        System.out.println("Total number of vehicles: " + vechicles.size());
        System.out.println("Removing vehicle 9: " + vechicles.remove(9));
        System.out.println("Removing vehicle 25 (does not exist): " + vechicles.remove(25));
        System.out.println("LinkedHashMap After modification" + vechicles);
        System.out.println("===============Checking key-value of vechicle==========================");
        if(vechicles.containsKey(5))
        {
            System.out.println("vechicles has Bus as value ");
        }

        if(vechicles.containsValue("Benz"))
        {
            System.out.println("vechicle has 10 as key");
        }

        // get entrySet

        System.out.println("==============Iterating over LinkedHashMap's ===========================");
        for (Map.Entry<Integer, String> entry : vechicles.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            // Removing all entries from Map

           System.out.println("==============Removing all entries in map==============");
           vechicles.clear();
           System.out.println(vechicles);


        }
    }
}

