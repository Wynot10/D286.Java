import java.util.Scanner;

public class bubbleSortArray6_28 {
    /* Define your method here */
    public static void sortArray(int[] myArr, int arrSize) {
        int i, j, tempVal;

        // Bubble sort algorithm
        for (i = 0; i < arrSize - 1; ++i) {
            for (j = 0; j < arrSize - i - 1; ++j) {

                if (myArr[j] < myArr[j + 1]) {

                    tempVal = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = tempVal;

                }
            }
        }
    }

    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        int arrSize = scnr.nextInt();
        int [] myArray = new int[arrSize];

        for (int i = 0; i < myArray.length; ++i) {
            myArray[i] = scnr.nextInt();
        }

        sortArray(myArray, arrSize);




        // output array
        for (int i = 0; i <myArray.length; ++i) {
            System.out.print(myArray[i] + ",");
        }
        System.out.println();
    }
}
