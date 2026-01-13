import java.util.Scanner;

public class stringComparisons3_13 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstString;
        String secondString;
        System.out.println("Enter first string: ");
        firstString = scnr.nextLine();
        System.out.println("Enter second string: ");
        secondString = scnr.nextLine();

        // Compares Strings with case sensitivity
        if  (firstString.equals(secondString)) {
            System.out.println("Strings are the same");
        }
        else {
            System.out.println("Strings are different");
        }

        if (firstString.equalsIgnoreCase(secondString)) {
            System.out.println("Strings are the same but are not case sensitive");

        }
        else {
            System.out.println("Strings are different");
        }

        System.out.println("Printing in alphabetical order");
        if (firstString.compareTo(secondString) < 0) {
            System.out.println(firstString + " " +  secondString);
        }
        else {
            System.out.println(secondString + " " +  firstString);
        }
    }
}
