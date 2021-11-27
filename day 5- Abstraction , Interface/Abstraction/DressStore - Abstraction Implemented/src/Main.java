import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HomeItems obj = new HomeItems();
        int input;
        int i =0;
        Scanner sc = new Scanner(System.in);
        obj.Display();
        do{
            System.out.println("");
            System.out.println(" 1.Mens \n 2.Ladies\n 3. HomeDecor \n 4.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                   obj.mensCollection();

                    break;
                case 2:
                    obj.ladiesCollection();
                    break;
                case 3:

                    obj.HomeAndLiving();
                case 4:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
