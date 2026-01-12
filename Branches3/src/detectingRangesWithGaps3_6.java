import java.util.Scanner;
public class detectingRangesWithGaps3_6 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a room number: ");
        int userNum = scnr.nextInt();

        if ((userNum >= 100 && userNum <= 200) || (userNum >= 500 && userNum <= 600)){
            System.out.print("valid room number.");
        }
        else{
            System.out.print("invalid room number.");
        }
    }
}
