import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExchangerMain {

    public static void main(String[] args) throws IOException {
        double amount = 0;
        int code;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {

            CurrencyConvertor convertor = new Exchange();

            System.out.println("hi, Welcome to the Currency Converter!");

            System.out.println("which currency You want to Convert ? ");

            System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
            code = sc.nextInt();
            System.out.println("How much Money you want to convert ?");
            amount = sc.nextFloat();
            switch (code) {
                case 1:
                    convertor.amountConversion(1, amount);
                    break;
                case 2:
                    convertor.DollarConversion(2, amount);
                    break;
                case 3:
                    convertor.PoundConversion(3, amount);
                    break;
                case 4:
                    convertor.EuroConversion(4, amount);
                    break;
                case 5:
                    convertor.YenConversion(5, amount);
                    break;
                case 6:
                    convertor.RinggitConversion(6, amount);
                    break;
                case 7:
                    i = 1;
                    break;
                default:
                    System.out.println("Thank you for choosing our services");
            }
        } while (i == 0);
    }
}


