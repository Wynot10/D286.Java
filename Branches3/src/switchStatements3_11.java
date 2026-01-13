import java.util.Scanner;
public class switchStatements3_11 {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a Char, either a/A or b/B: " );
        char userChar = scnr.next().charAt(0);

        switch (userChar) {
            case 'a':
            // overflow performed because I want the same line to print for 'a' and 'A'
            case 'A':
                System.out.println("Alpha");
                break;
            case 'b':
            // overflow performed because I want the same line to print for 'b' and 'B'
            case 'B':
                System.out.println("Beta");
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
