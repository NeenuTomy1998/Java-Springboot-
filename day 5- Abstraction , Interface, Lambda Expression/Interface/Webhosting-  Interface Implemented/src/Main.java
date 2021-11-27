import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WebsiteHosting godaddy = new Godaddy();
        WebsiteHosting bluehost = new Bluehost();
        int input;
        int i =0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("=======Welcome to hosting services=======");
            System.out.println(" 1.Godaddy\n 2.Bluehost\n 3.Exit");
            input = sc.nextInt();
            switch (input){
                case 1:
                    godaddy.Services();
                    godaddy.Pricing();
                    break;
                case 2:
                    bluehost.Services();
                    bluehost.Pricing();
                    break;
                case 3:
                    i=1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}
