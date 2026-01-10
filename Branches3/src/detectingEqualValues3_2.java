import java.util.Scanner;
public class detectingEqualValues3_2 {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        int hotelRate;
        int numYears;

        hotelRate = 150;

        System.out.print("Enter years married: ");
        numYears = scnr.nextInt();

        if (numYears == 50) {
            System.out.print("Congrats on 50 years ");
            System.out.println("of marriage!");

            hotelRate = hotelRate / 2;
        }

        System.out.print("Your hotel rate: ");
        System.out.println(hotelRate);

        // Even or odd

        int userNum;
        int divRemainder;

        System.out.print("Enter a number: ");
        userNum = scnr.nextInt();

        divRemainder = userNum % 2;

        if (divRemainder == 0) {
            System.out.println(userNum + " is even.");
        }
        else {
            System.out.println(userNum + " is odd.");
        }

        // Anniversaries
        int numYears2;

        System.out.print("Enter number years married: ");
        numYears2 = scnr.nextInt();

        if (numYears2 == 1) {
            System.out.println("Your first year -- great!");
        }
        else if (numYears2 == 10) {
            System.out.println("A whole decade -- impressive.");
        }
        else if (numYears2 == 25) {
            System.out.println("Your silver anniversary -- enjoy.");
        }
        else if (numYears2 == 50) {
            System.out.println("Your golden anniversary -- amazing.");
        }
        else {
            System.out.println("Nothing special.");
        }
    }
}
