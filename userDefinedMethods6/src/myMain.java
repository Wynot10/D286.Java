import java.util.Scanner;
public class myMain {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numToSquare;

        System.out.print(" 12 inch pizza is ");
        // Import method from another file. Must use dot notation with file name being imported
        // File name - PizzaArea
        // Method name calcPizzaArea()
        System.out.printf("%.3f", PizzaArea.calcPizzaArea(12.0));
        System.out.println(" inches squared.");


        System.out.print("Enter a number to square: ");
        numToSquare = scnr.nextInt();

        System.out.println(numToSquare + " squared = " + SquareNumber.computeSquare(numToSquare));
    }
}
