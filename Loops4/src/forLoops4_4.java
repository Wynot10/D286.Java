import java.util.Scanner;
public class forLoops4_4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Savings with interest program

        double initialSavings;  // User-entered initial savings
        double interestRate;    // Interest rate
        double currSavings;     // Current savings with interest
        int i;                  // Loop variable

        System.out.print("Enter initial savings: ");
        initialSavings = scnr.nextDouble();

        System.out.print("Enter interest rate: ");
        interestRate = scnr.nextDouble();

        System.out.println("\nAnnual savings for 10 years: ");

        currSavings = initialSavings;
        for (i = 0; i < 10; ++i) {
            System.out.println("$" + currSavings);
            currSavings = currSavings + (currSavings * interestRate);
        }

        // Computing Average Program

        int currValue;
        int valuesSum;
        int numValues;
        int j;

        System.out.print("Enter number of values: ");
        numValues = scnr.nextInt(); // Gets number of values in list

        valuesSum = 0;

        for (j = 0; j < numValues; ++j) {
            currValue = scnr.nextInt(); // Gets next value in list
            valuesSum += currValue;
        }

        System.out.println("Average: " + (valuesSum / numValues));
    }
}
