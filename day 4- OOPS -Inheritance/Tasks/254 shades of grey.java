

/*Why would we want to stop to only 50 shades of grey? Let's see to how many we can go.

Write a function that takes a number n as a parameter and return an array containing n shades of grey in hexadecimal
 code (#aaaaaa for example). The array should be sorted in ascending order starting with '#010101', '#020202', etc.
(using lower case letters).*/



public class ShadesOfGrey {

    static String[] shadesOfGrey(int number) {
        if(number <= 0)
            number = 0;
        if(number > 254)
            number = 254;
        String[] res = new String[number];
        for(int i = 0; i < number; i++) {
            res[i] = String.format("#%1$02x%1$02x%1$02x", i + 1);
        }
        return res;
    }
}
