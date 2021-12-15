import java.io.IOException;

public interface CurrencyConvertor {
   void  amountConversion(int value, double amount) throws IOException;
   void  DollarConversion(int value,  double amount) throws IOException;
   void PoundConversion(int value,  double amount) throws IOException;
   void EuroConversion(int value,  double amount) throws IOException;
   void  YenConversion(int value,  double amount) throws IOException;
   void  RinggitConversion(int value,  double amount) throws IOException;

}