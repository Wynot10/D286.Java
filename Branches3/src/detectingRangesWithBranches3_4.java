import java.util.Scanner;
public class detectingRangesWithBranches3_4 {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int givenYear;

        System.out.print("Enter the years to be detected: ");
        givenYear = scnr.nextInt();

        /* Your solution goes here  */
        if (givenYear >= 2101) {
            System.out.println("Distant future");
        }
        else if (givenYear >= 2001) {
            System.out.println("21st century");
        }
        else if (givenYear >= 1901) {
            System.out.println("20th century");
        }
        else {
            System.out.println("Long ago");
        }

    }
}
