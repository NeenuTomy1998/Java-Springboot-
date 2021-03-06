import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

   
    public static String encryption(String s) {
   
        s = s.replaceAll("\\s", "");
        double l = Math.sqrt(s.length());
        int row = (int)Math.floor(l);
        int column = (int)Math.ceil(l);
        char[][] arr=new char[row][column];
        int len=(int) (row>column?row:column);
        String o="";
        for(int i=0;i<len;i++) {
            for(int j=i;j<s.length();j=(int) (j+column)) {
                char ch=s.charAt(j);
                o+=ch;
            }
            o+=" ";
        }
        return o;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}