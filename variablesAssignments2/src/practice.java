import java.util.Scanner;

public class practice {
    public static void main (String[] args) {
        char arrowBody;
        char arrowHead;

        // Char variables are surrounded by single quotes ' '
        arrowBody = '-';
        arrowHead = '>';

        System.out.println(arrowHead);
        System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);

        arrowBody = 'o';

        System.out.println("" + arrowBody + arrowBody + arrowBody + arrowHead);



        Scanner scnr = new Scanner(System.in);
        char bodyChar;
        char headChar;

        System.out.print("Enter two characters: ");

        /*
        The charAt(0) is explained in another section. Briefly, next() gets the next sequence of non-whitespace
        characters (as a string), and charAt(0) gets the first character in that string
         */
        bodyChar = scnr.next().charAt(0);
        headChar = scnr.next().charAt(0);

        // Output arrow body then head
        System.out.print(bodyChar);
        System.out.print(bodyChar);
        System.out.print(bodyChar);
        System.out.println(headChar);

        /*
        Escape sequence	Char
        \n	newline
        \t	tab
        \'	single quote
        \"	double quote
        \\	backslash
         */

        char c1 = 'y';
        char c2 = 'a';
        /*
        The initial "" tells the compiler to output a string of characters, and the +'s combine the subsequent
        characters into such a string. Without the "", the compiler will simply add the numerical values of c1 and c2,
        and output the resulting sum.
         */
        System.out.print("" + c1 + c2);
    }
}
