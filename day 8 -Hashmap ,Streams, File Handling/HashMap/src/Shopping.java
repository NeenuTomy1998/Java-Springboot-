import java.util.HashMap;
import java.util.Map;

public class Shopping {
    public static void main(String[] args) {

        HashMap<String, Double> groceryItems = new HashMap<String, Double>();
        //adding items to shop
        groceryItems.put("Tomatoes", 10.50);
        groceryItems.put("Onions", 4.50);
        groceryItems.put("Potatoes", 20.00);
        groceryItems.put(" Oil", 7.00);
        System.out.println("\nThe Total items in cart" +groceryItems);

        //getting value for the given key from hashmap

        System.out.println("\nPrice of Potatoes: "+groceryItems.get("Onions"));
        System.out.println("\nIs store empty :  "+groceryItems.isEmpty());

        groceryItems.remove("Potatoes");

        System.out.println("\n"+groceryItems);
        System.out.println("\nSize of the HashMap: "+groceryItems.size());
       groceryItems.putIfAbsent("Rice" , 102.00);

        System.out.println("\n================Searching Grocery List of Items keys or Names======================= \n");

        if (groceryItems.containsKey("Canola Oil")) {

            System.out.println("The shoppingCart contains key Canola Oil");

        } else {

            System.out.println("The shoppingCart does not contains key Canola Oil");

        }

        if (groceryItems.containsKey("JackFruit")) {

            System.out.println("The shoppingCart contains key JackFruit");

        } else {

            System.out.println("The shoppingCart does not contains key Onions");

        }


       for (Map.Entry<String, Double> m:groceryItems.entrySet()){
           System.out.println(m.getKey() + " -> " + m.getValue());
       }

    }
}
