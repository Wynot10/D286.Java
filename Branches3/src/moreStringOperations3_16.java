import java.util.Scanner;
public class moreStringOperations3_16 {
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        String emailTxt;
        int atSymbol;
        String userName = "";
        boolean userNameIsValid = false;

        System.out.println("Enter your email address: ");
        emailTxt = scnr.nextLine();
        atSymbol = emailTxt.indexOf('@');

        if (emailTxt.indexOf('@')==-1) {
            System.out.println("Invalid email address");
        }
        else {
            userName = emailTxt.substring(0, atSymbol);
            userNameIsValid = true;
        }

        if (userNameIsValid) {
            System.out.print("Username is: ");
            System.out.println(userName);
        }
    }
}
