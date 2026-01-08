import java.util.Scanner;
public class strings2_15 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        /*
        A String variable is a reference type (discussed in depth elsewhere) variable that refers to a String object.
        An object consists of some internal data items plus operations that can be performed on that data. Ex: String
        movieTitle = "Frozen"; declares a String reference variable named movieTitle that refers to a String object.
        That String object stores the string "Frozen".

        A programmer can assign a String variable with a string literal, which creates a new String object.
        Ex: movieTitle = "The Martian"; creates a new String object with the string "The Martian", and assigns the
        String object's reference to the variable movieTitle.

        Assigning one String variable to another String variable causes both variables to refer to the same String,
        and does not create a new String. Ex: movieTitle = favoriteMovie; assigns favoriteMovie's reference to
        movieTitle. Both movieTitle and favoriteMovie refer to the same String object.
         */

        String sentenceSubject;
        String sentenceVerb;
        String sentenceObject = "an apple";

        sentenceSubject = "boy";
        sentenceVerb = "ate";

        System.out.print("A ");
        System.out.print(sentenceSubject + " ");
        System.out.print(sentenceVerb + " ");
        System.out.println(sentenceObject + ".");

        System.out.print("Enter a string: ");
        // This will skip initial white space take in the next characters until the next whitespace is seen
        String userString = scnr.next();
        System.out.println(userString);


        /*
        Example: Word Game
        A game inspired by "Mad Libs" where user enters nouns,
        verbs, etc., and then a story using those words is output.
        */

        String wordRelative;
        String wordFood;
        String wordAdjective;
        String wordTimePeriod;

        // Get user's words
        System.out.println("Provide input without spaces.");

        System.out.println("Enter a kind of relative: ");
        wordRelative = scnr.next();

        System.out.println("Enter a kind of food: ");
        wordFood = scnr.next();

        System.out.println("Enter an adjective: ");
        wordAdjective = scnr.next();

        System.out.println("Enter a time period: ");
        wordTimePeriod = scnr.next();

        // Tell the story
        System.out.println();
        System.out.print  ("My " + wordRelative);
        System.out.println(" says eating " + wordFood);
        System.out.println("will make me more " + wordAdjective + ",");
        System.out.println("so now I eat it every " + wordTimePeriod + ".");


        System.out.print("Enter another string: ");
        // Will take in whitespace and characters
        String userString2 = scnr.nextLine();
        System.out.println(userString2);

        String firstName;
        String lastName;

        System.out.println("Enter first name: ");
        firstName = scnr.nextLine(); // Gets entire line up to ENTER

        System.out.println("Enter last name: ");
        lastName = scnr.nextLine(); // Gets entire line up to ENTER

        System.out.println();
        System.out.println("Welcome " + firstName + " " + lastName + "!");
        System.out.println("May I call you " + firstName + "?");
    }
}
