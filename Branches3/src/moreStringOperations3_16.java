import java.util.Scanner;
public class moreStringOperations3_16 {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        String emailTxt;
        int atSymbol;
        String userName1 = "";
        boolean userNameIsValid = false;
        String myString = "Good bye";

        System.out.println("Enter your email address: ");
        emailTxt = scnr.nextLine();
        atSymbol = emailTxt.indexOf('@');

        if (emailTxt.indexOf('@')==-1) {
            System.out.println("Invalid email address");
        }
        else {
            userName1 = emailTxt.substring(0, atSymbol);
            userNameIsValid = true;
        }

        if (userNameIsValid) {
            System.out.print("Username is: ");
            System.out.println(userName1);
        }

        myString = myString.replace("bye", "evening");
        System.out.println(myString);

        String userName;
        String greetingText;

        System.out.print("Enter name: ");
        userName = scnr.nextLine();

        // Combine strings using +
        greetingText = "Hello " + userName;

        // Append a period (could have used +)
        greetingText = greetingText.concat(".");
        System.out.println(greetingText);

        // Insert Mr/Ms before user's name
        greetingText = "Hello Mr/Ms ";
        greetingText = greetingText.concat(userName);
        greetingText = greetingText.concat(".");
        System.out.println(greetingText);

        // Replace occurrence of "Darn" by "@$#"
        greetingText = greetingText.replace("Darn", "@$#");
        System.out.println(greetingText);
    }
}
