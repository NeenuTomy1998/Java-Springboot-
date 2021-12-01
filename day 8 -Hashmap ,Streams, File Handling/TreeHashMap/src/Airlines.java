import java.util.Set;
import java.util.TreeMap;

public class Airlines {
    public static void main(String[] args) {
        TreeMap<String, String> flight =new TreeMap<>();
        flight.put("AirIndia","45");
        flight.put("JetJapan","95");
        flight.put("AirlineFrance","25");
        flight.put("Russia", "32");
        flight.put("KuwaitAirline" , "75");
        System.out.println("==============Welcome to India Fight Services====================");
        System.out.println("Flights Available :" +flight);
        System.out.println("==========HeadMap-TailMap-subMap==============");
        System.out.println(" HeadMap : " +flight.headMap("45"));
        System.out.println("TailMap :" +flight.tailMap("32"));
        System.out.println("SubMap :"  +flight.subMap("45", "75"));
        System.out.println("=============ascending and decending order===========");
        System.out.println("Entries in ascending order : " +flight);
        System.out.println("Entries in decending order: " +flight.descendingKeySet());
        System.out.println("===============Removing flight============================");
        flight.remove("Russia");
        System.out.println("Entries of TreeMap after removing flight: " +flight);
        System.out.println("================Replacing Flight========================");
        flight.replace("JetJapan","101");
        System.out.println("Updated enrties of Flight: " +flight);

        System.out.println("====================Entry-key-value==================");
        Object entrySet = flight.entrySet();
        System.out.println("Entry set: " +entrySet);
        System.out.println("Key set: " +flight.keySet());
        System.out.println("Value set: " +flight.values());

        Object vGet = flight.get("KuwaitAirline");
        System.out.println("value: " +vGet);


        System.out.println("==================Iterating TreeMap======================================");
        for (String countryKey:flight.keySet()) {
            System.out.println("Fight:"+ countryKey +" and  Fight Number:"+flight.get(countryKey));

        }
        System.out.println("-------------------------------Thank you --------------------------------------------------");
    }
}
