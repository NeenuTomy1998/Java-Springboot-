import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

 class Exchange implements CurrencyConvertor {
    double amount, dollar, pound, code, euro, yen, ringgit, rupee;
     public void fileWriter(String amount ,String fromCurrency ,String toCurrency , String convertedAmount)throws IOException{
         FileWriter fw = new FileWriter("log.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         bw.write("-----------------Currency Converting from " + fromCurrency +" to " + toCurrency +"-----------------------------");
         bw.newLine();
         bw.write("Currency chosen by the user => " + fromCurrency);
         bw.newLine();
         bw.write("Currency converted by the user => " + toCurrency );
         bw.newLine();
         bw.write("User entered Amount => " + amount);
         bw.newLine();
         bw.write("Converted Amount => " + convertedAmount);
         bw.newLine();
         bw.write("========================================================================");
         bw.newLine();
         bw.close();
     }
    public void amountConversion(int code ,  double amount)throws IOException {
       if(amount<=0){
           throw new IllegalArgumentException("Amount can't be less than or equal to zero");
       }
        DecimalFormat f = new DecimalFormat("##.##");
       if (code == 1) {

            dollar = amount / 70;
            System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
            fileWriter(String.valueOf(amount),"Rupee","Dollar" , String.valueOf(dollar));
            pound = amount / 88;
            System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
           fileWriter(String.valueOf(amount),"Rupee","pound" , String.valueOf(pound));
            euro = amount / 80;
            System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
           fileWriter(String.valueOf(amount),"Rupee","euro" , String.valueOf(euro));
            yen = amount / 0.63;
            System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
           fileWriter(String.valueOf(amount),"Rupee","Yen" , String.valueOf(yen));
            ringgit = amount / 16;
            System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
           fileWriter(String.valueOf(amount),"Rupee","ringgit" , String.valueOf(ringgit));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

    public void DollarConversion(int code,  double amount)throws IOException{
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be less than or equal to zero");
        }
        DecimalFormat f = new DecimalFormat("##.##");
        if (code == 2) {

            // For Dollar Conversion

            rupee = amount * 70;
            System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
            fileWriter(String.valueOf(amount),"Rupee","Rupees" , String.valueOf(rupee));

            pound = amount * 0.78;
            System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
            fileWriter(String.valueOf(amount),"Rupee","Pound" , String.valueOf(pound));
            euro = amount * 0.87;
            System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
            fileWriter(String.valueOf(amount),"Rupee","euro" , String.valueOf(euro));

            yen = amount * 111.087;
            System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
            fileWriter(String.valueOf(amount),"Rupee","yen" , String.valueOf(yen));
            ringgit = amount * 4.17;
            System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
            fileWriter(String.valueOf(amount),"Rupee","ringgit" , String.valueOf(ringgit));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

    public void PoundConversion(int code,  double amount)throws IOException {
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be less than or equal to zero");
        }
        DecimalFormat f = new DecimalFormat("##.##");
        if (code == 3) {
            // For Pound Conversion

            rupee = amount * 88;
            System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Rupees");
            fileWriter(String.valueOf(amount),"Rupee","rupee" , String.valueOf(rupee));
            dollar = amount * 1.26;
            System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
            fileWriter(String.valueOf(amount),"Rupee","Dollar" , String.valueOf(dollar));
            euro = amount * 1.10;
            System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
            fileWriter(String.valueOf(amount),"Rupee","euro" , String.valueOf(euro));
            yen = amount * 140.93;
            System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
            fileWriter(String.valueOf(amount),"Rupee","yen" , String.valueOf(yen));
            ringgit = amount * 5.29;
            System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
            fileWriter(String.valueOf(amount),"Rupee","ringgit" , String.valueOf(ringgit));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

    public void EuroConversion(int code,  double amount)throws IOException{
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be less than or equal to zero");
        }
        DecimalFormat f = new DecimalFormat("##.##");
        if (code == 4) {
            // For Euro Conversion

            rupee = amount * 80;
            System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Rupees");
            fileWriter(String.valueOf(amount),"Rupee","rupee" , String.valueOf(rupee));
            dollar = amount * 1.14;
            System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
            fileWriter(String.valueOf(amount),"Rupee","dollar" , String.valueOf(dollar));
            pound = amount * 0.90;
            System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
            fileWriter(String.valueOf(amount),"Rupee","pound" , String.valueOf(pound));
            yen = amount * 127.32;
            System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
            fileWriter(String.valueOf(amount),"Rupee","yen" , String.valueOf(yen));
            ringgit = amount * 4.78;
            System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
            fileWriter(String.valueOf(amount),"Rupee","ringgit" , String.valueOf(ringgit));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

    public void YenConversion(int code,  double amount)throws IOException{
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be less than or equal to zero");
        }
        DecimalFormat f = new DecimalFormat("##.##");
        if (code == 5) {
            rupee = amount * 0.63;
            System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
            fileWriter(String.valueOf(amount),"Rupee","rupee" , String.valueOf(rupee));

            dollar = amount * 0.008;
            System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
            fileWriter(String.valueOf(amount),"Rupee","dollar" , String.valueOf(dollar));

            pound = amount * 0.007;
            System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
            fileWriter(String.valueOf(amount),"Rupee","pound" , String.valueOf(pound));

            euro = amount * 0.007;
            System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
            fileWriter(String.valueOf(amount),"Rupee","euro" , String.valueOf(euro));

            ringgit = amount * 0.037;
            System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
            fileWriter(String.valueOf(amount),"Rupee","ringgit" , String.valueOf(ringgit));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }

    public void RinggitConversion(int code,  double amount)throws  IOException {
        if(amount<=0){
            throw new IllegalArgumentException("Amount can't be less than or equal to zero");
        }
        DecimalFormat f = new DecimalFormat("##.##");
        if (code == 6) {
            // For Ringgit Conversion

            rupee = amount * 16.8;
            System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");
            fileWriter(String.valueOf(amount),"Rupee","rupee" , String.valueOf(rupee));

            dollar = amount * 0.239;
            System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");
            fileWriter(String.valueOf(amount),"Rupee","dollar" , String.valueOf(dollar));

            pound = amount * 0.188;
            System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");
            fileWriter(String.valueOf(amount),"Rupee","pound" , String.valueOf(pound));

            euro = amount * 0.209;
            System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");
            fileWriter(String.valueOf(amount),"Rupee","euro" , String.valueOf(euro));

            yen = amount * 26.63;
            System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
            fileWriter(String.valueOf(amount),"Rupee","yen" , String.valueOf(yen));
        } else {
            throw new IllegalArgumentException("make sure preferred currency is valid");
        }
    }
}