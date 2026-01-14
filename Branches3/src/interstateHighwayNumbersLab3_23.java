import java.util.Scanner;
public class interstateHighwayNumbersLab3_23 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;

        System.out.print("Enter highway number: ");
        highwayNumber = scnr.nextInt();

        /* Type your code here. */
        if ((highwayNumber <= 0) || (highwayNumber > 999)) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        }
        else {
            if (highwayNumber <= 99) {
                if (highwayNumber % 2 == 0) {
                    System.out.println("I-" + highwayNumber + " is primary, going east/west.");
                }
                else {
                    System.out.println("I-" + highwayNumber + " is primary, going north/south.");
                }
            }
            else if (highwayNumber <= 999) {
                if (highwayNumber % 100 == 0) {
                    System.out.println(highwayNumber + " is not a valid interstate highway number.");
                }
                else {
                    if ((highwayNumber % 100) % 2 == 0) {
                        System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going east/west.");
                    }
                    else {
                        System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going north/south.");
                    }


                }
            }
        }
    }
}
