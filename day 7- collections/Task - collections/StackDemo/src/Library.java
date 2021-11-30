import java.util.Stack;

public class Library {
    public static void main(String[] args) {

            // Creating a Stack
            Stack<String> book = new Stack<>();

            // Pushing items to the Stack
            book.push("Comic");
            book.push("Fiction");
            book.push("Kids comic");
            book.push("Indiabicks");

            System.out.println("Stack Values Added " + book);
            System.out.println();
            // Check if the Stack is empty
            System.out.println("Is Stack empty: : " + book.isEmpty());

             // The size of Stack
            System.out.println("Size of Stack : " + book.size());

            //popping values

             String Top = book.pop();
             System.out.println("New Updated Card at Top: " +Top);
              System.out.println("Current updated books:" +book);

        //peek values


        Top = book.peek();
        System.out.println("Stack peek : " + Top);
        System.out.println("Current updated books : " + book);

        int position = book.search("Comic");

        if(position != -1) {
            System.out.println("Found the element \"comic\" at position : " + position);
        } else {
            System.out.println("Book not found");
        }


        }
    }
