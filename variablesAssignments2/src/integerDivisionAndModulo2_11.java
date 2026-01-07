import java.util.Scanner;
public class integerDivisionAndModulo2_11 {
    public static void main(String[] args) {
        int y;

        y = 10 / 4; // Integer division will result in 0
        System.out.println("Result of y " + y);

        double z;

        z = 10 / 4.0; // Division where one operand is a double
        System.out.println("Result of z " + z);

        // Modulo operator

        int w;

        w = 24 % 5; // assigns w with the remainder of 24 / 5
        System.out.println("Result of w " + w);

        // Get digits program

        int userVal;
        int onesDigit;
        int tmpVal;
        int tensDigit;
        int hundredsDigit;
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your number: ");
        userVal = scnr.nextInt();

        onesDigit = userVal % 10;    // Ex: 927 % 10 is 7.
        tmpVal = userVal / 10;

        tensDigit = tmpVal % 10;     // Ex: tmpVal = 927 / 10 is 92. Then 92 % 10 is 2.
        tmpVal = tmpVal / 10;

        hundredsDigit = tmpVal % 10;     // Ex: tmpVal = 92 / 10 = 9. Then 9 % 10 is 9.

        System.out.println("Ones digit: "  + onesDigit);
        System.out.println("Tens digit: "  + tensDigit);
        System.out.println("Hundreds digit: "  + hundredsDigit);

        /*

        Given a 10-digit phone number stored as an integer, % and / can be used to get any part, such as the prefix.
        For phoneNum = 1365551212 (whose prefix is 555):

        tmpVal = phoneNum / 10000; // / 10000 shifts right by 4, so 136555.
        prefixNum = tmpVal % 1000; // % 1000 gets the right 3 digits, so 555.
        Dividing by a power of 10 shifts a value right. 321 / 10 is 32. 321 / 100 is 3.

        % by a power of 10 gets the rightmost digits. 321 % 10 is 1. 321 % 100 is 21.

        */

        




    }
}
