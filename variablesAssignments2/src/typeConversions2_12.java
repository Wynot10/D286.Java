import java.util.Scanner;
public class typeConversions2_12 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numBirths = 316;

        /* Implicit or automatic type cast on integer numbirths casting to double
        since dividing by a double number (0.504)*/
        double expectedMales = 0.504 * numBirths;

        System.out.print("Expected number of males: ");

        // Manipulate decimal to print 1 decimal place
        System.out.printf("%.1f\n",  expectedMales);
    }
}
