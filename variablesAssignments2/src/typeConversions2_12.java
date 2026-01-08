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

        int kidsInFamily1;       // Should be int, not double
        int kidsInFamily2;       // (know anyone with 2.3 kids?)
        int numFamilies;

        double avgKidsPerFamily; // Expect fraction, so double

        kidsInFamily1 = 3;
        kidsInFamily2 = 4;
        numFamilies = 2;

        // Explicit type cast, 1 type cast would have worked too.
        avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2)
                / (double)numFamilies;

        System.out.println("Average kids per family: " + avgKidsPerFamily);
    }
}
