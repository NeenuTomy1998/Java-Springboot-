import java.util.Iterator;
import java.util.Vector;

public class DressStore {

    public static void main(String[] args) {
        Vector<String> store =new Vector<>(10);
        store.add("Jeans");
        store.add("Shirt");
        store.add("Pants");
        store.add("shoes");
        store.addElement("Winter Jacket");
        System.out.println("Items in Store :" +store);
        System.out.println(store.firstElement());
        System.out.println("Siz of Items : " +store.capacity());
        if(store.contains("Jeans"))
        {
            System.out.println("Jeans is present at the store " +store.indexOf("Jeans"));
        }
        else
        {
            System.out.println("Jeans is not present in the Store.");
        }
        System.out.println("The first Item of the vector is = "+store.firstElement());
        //Get the last element
        System.out.println("The last animal of the vector is = "+store.lastElement());
        System.out.println("Element at index 3 is = "+store.get(3));
        System.out.println("\n ================Iterating using iterator()==============");
        for(Iterator<String> it = store.iterator();it.hasNext();)
        {
            System.out.println(it.next());
            }
        }


    }

