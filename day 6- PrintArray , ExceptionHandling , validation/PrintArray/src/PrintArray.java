
class Display<E>{
    public void printArray(E[] array){
        Object[] newArray = new Object[array.length];

        for (int i = 0; i <array.length ; i++)

        {
            newArray[i]=array[array.length-i-1];
        }
        for (int i = 0; i <newArray.length ; i++)

        {
            System.out.println(newArray[i]);
        }
    }
}
public class PrintArray {

    public static void main(String[] args) {

        Integer[] integerArray = {1,2,3};
        String[] stringArray = {"Hello","Prograds"};
        Display<Integer> obj = new Display<Integer>();
        Display<String> obj2 =new Display<String>();
        obj.printArray(integerArray);
        obj2.printArray(stringArray);
    }
}
