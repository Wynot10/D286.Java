import java.util.Scanner;

public class methodPractice {
    /* Your code goes here */
    public static void outputVal(int num1, int num2) {
        int returnVal = 1;

        if (num1 < 0) {
            while (num1 <= -1 && num1 <= num2) {

                returnVal *= num1;
//                System.out.println(returnVal);
                ++num1;

            }
            System.out.println(returnVal);
        }
        else {
            System.out.println(returnVal);
        }
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numberA;
        int numberB;

        numberA = scnr.nextInt();
        numberB = scnr.nextInt();
        outputVal(numberA, numberB);
    }
}
