import java.util.Stack;

public class Card {
    public static void main(String[] args) {

            // Creating a Stack
            Stack<String>  stackOfCards = new Stack<>();

            // Pushing items to the Stack
            stackOfCards.push("Jack");
            stackOfCards.push("Queen");
            stackOfCards.push("King");
            stackOfCards.push("Jocker");

            System.out.println("Stack Values Added " + stackOfCards);
            System.out.println();


            //popping values

        String Top = stackOfCards.pop();
        System.out.println("New Updated Card at Top: " +Top);
        System.out.println("Current Stack :" +stackOfCards);

        //peek values


        Top = stackOfCards.peek();
        System.out.println("Stack peek : " + Top);
        System.out.println("Current Stack : " + stackOfCards);
        }
    }
