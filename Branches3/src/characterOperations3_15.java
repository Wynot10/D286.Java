import java.util.Scanner;
public class characterOperations3_15 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput;
        char let0;
        char let1;

        System.out.print("Enter a two-letter state abbreviation: ");
        userInput = scnr.next();
        let0 = userInput.charAt(0);
        let1 = userInput.charAt(1);

        if ( ! (Character.isLetter(let0) && Character.isLetter(let1)) ) {
            System.out.println("Error: Both are not letters.");
        }
        else {
            let0 = Character.toUpperCase(let0);
            let1 = Character.toUpperCase(let1);
            System.out.println("Capitalized: " + let0 + let1);
        }
    }
}
