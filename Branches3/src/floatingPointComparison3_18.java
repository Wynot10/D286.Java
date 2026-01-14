import java.util.Scanner;
import java.lang.Math;

public class floatingPointComparison3_18 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double bodyTemp;
        double myDouble;
        String myString = "";

        System.out.print("Enter body temperature in Fahrenheit: ");
        bodyTemp = scnr.nextDouble();

        // Floating point comparison used with 0.0001 AKA epsilon value
        if (Math.abs(bodyTemp - 98.6) < 0.0001) {
            System.out.println("Temperature is exactly normal.");
        }
        else if (bodyTemp > 98.6) {
            System.out.println("Temperature is above normal.");
        }
        else {
            System.out.println("Temperature is below normal.");
        }

        System.out.print("Enter a double number: ");
        myDouble = scnr.nextDouble();

        myString = (Math.abs(myDouble - 10.0) < 0.0001) ? "Doubles match": "Doubles do not match";

        System.out.println(myString);

    }
}
