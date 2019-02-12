import java.util.ArrayList;

//Expected outcome of the code:
//        0: (Binary) 000000000 (Octal) 000000000 (Hexadecimal) 000000000
//        1: (Binary) 000000001 (Octal) 000000001 (Hexadecimal) 000000001
//        63: (Binary) 000111111 (Octal) 000000077 (Hexadecimal) 00000003F
//        127: (Binary) 001111111 (Octal) 000000177 (Hexadecimal) 00000007F
//        255: (Binary) 011111111 (Octal) 000000377 (Hexadecimal) 0000000FF
//        256: (Binary) 100000000 (Octal) 000000400 (Hexadecimal) 000000100

//Extra Credit Base at the bottom of code!

public class Main {

    public static int max= 9;

    public static void main(String[] args) {

        int[] numbers = {0, 1, 63, 127, 255, 256};
        System.out.println("\nBinary, Octal, and Hexadecimal Values:");
        for (int x : numbers) {
            System.out.printf("%3d: (Binary) %s (Octal) %s (Hexadecimal) %s\n", x, Binary(x), Octal(x), Hexadecimal(x));
        }

        System.out.println("\nExtra Credit Method:");
        for (int x : numbers) {
            System.out.printf("%3d: %s\n", x, ExtraCredit(x, 5));
        }
    }

//    Code for the Binary Base
    public static String Binary(int number){

        String binary= "";
        ArrayList binaryList = new ArrayList();

        for (int digits= max; digits > 0; digits-- ) {
            int digit = (int) Math.pow(2, digits- 1);
            int binaryIntAtDigit= number/digit;
            binaryList.add(binaryIntAtDigit);
            number= number%digit;
        }

        for(int i= 0; i < max; i++){
            binary+=binaryList.get(i).toString();
        }

        return binary;
    }

//    Code for the Octal Base
    public static String Octal(int number){

        String octal= "";
        ArrayList octalList= new ArrayList();

        for (int digits= max; digits > 0; digits-- ) {
            int digit= (int) Math.pow(8, digits- 1);
            int octalIntAtDigit= number/digit;
            octalList.add(octalIntAtDigit);
            number=  number%digit;
        }

        for(int i = 0; i < max; i++){
            octal+=octalList.get(i).toString();
        }

        return octal;
    }

//    Code for the Hexidecimal Base
    public static String Hexadecimal(int number){

        String hexadecimal = "";
      
        ArrayList hexadecimalDigits= new ArrayList();

        for (int digit= max; digit > 0; digit--) {
            int digit= (int) Math.pow(16, digit - 1);
            int hexIntAtDigit= number/digit;
            hexadecimalDigits.add(hexadecimalStrings.get(hexIntAtDigit));
            number=  number%digit;
        }

        for(int i= 0; i < hexadecimalDigits.size(); i++){
            hexadecimal+= hexadecimalDigits.get(i);
        }

        return hexadecimal;
    }

//    Code for the Extra Credit Base
    public static String ExtraCredit(int number, int base){

        String X = "(Pentadecimal, maybe? - Base " + Integer.toString(base) + ") ";

        if(base>16){
            return X + "Try Again! Base must be less than 16!";
        }
        
        ArrayList digits= new ArrayList();

        for (int digC= max; digC > 0; digC-- ) {
            int positionbase= (int) Math.pow(base, digC-1);
            int intAtPosition= number/positionbase;
            digits.add(baseStr.get(intAtPosition));
            number= number%positionbase;
        }

        for(int i= 0; i < digits.size(); i++){
            X+=digits.get(i);
        }

        return X;
    }
}
