import java.util.Scanner;
public class stringAccessOperations3_14 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userCaption;
        int lastIndex;
        char lastChar;
        String conCat1;
        String conCat2;
        String conCat3;

        System.out.print("Enter a caption: ");
        userCaption = scnr.nextLine();

        lastIndex = userCaption.length() - 1;
        lastChar  = userCaption.charAt(lastIndex);

        if ( (lastChar != '.') && (lastChar != '!') && (lastChar != '?') ) {
            // User's caption lacked ending punctuation, so add a period
            userCaption = userCaption + ".";
        }

        System.out.println("New: " + userCaption);

        System.out.print("Enter a string: ");
        conCat1 = scnr.nextLine();
        System.out.print("Enter a string to append: ");
        conCat2 = scnr.nextLine();

        conCat3 = conCat1.concat(" ");
        conCat3 = conCat3.concat(conCat2);
        System.out.println(conCat3);



    }
}
