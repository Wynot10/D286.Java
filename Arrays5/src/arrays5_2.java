import java.util.Arrays;
import java.util.Scanner;
public class arrays5_2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 8;             // Number of elements in array
        int[] userVals = new int[NUM_ELEMENTS]; // User numbers
        int i;                                  // Loop index

        System.out.println("Enter " + NUM_ELEMENTS + " integer values...");
        for (i = 0; i < userVals.length; ++i) {
            userVals[i] = scnr.nextInt();
            System.out.println("Value: " + userVals[i]);
        }

        System.out.print("You entered: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();

        // Not from Zybooks
        int [] newArr = {2, 9, 3, 7, 1};
        Arrays.sort(newArr);
        System.out.println("Sorted Array: " + Arrays.toString(newArr));
    }
}
