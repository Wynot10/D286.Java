import java.util.Scanner;
public class conditionalExpressions3_17 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int myNum = 0;
        System.out.print("Enter the first number: ");
        userNum = scnr.nextInt();

        // Ternary or conditional expression

        // increment operators on wrong side because it reads the variable before it increments
        myNum = (userNum == 1) ? myNum ++: myNum--;
        System.out.println("The increment/decrement operators are on the wrong side of the variable: " + myNum);

        // increment operators on the correct side
        myNum = (userNum == 1) ? ++myNum : --myNum;

        System.out.println("The increment/decrement operators are on the correct side: " + myNum);

    }
}
