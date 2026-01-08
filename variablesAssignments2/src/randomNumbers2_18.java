// enables use of the Random class
import java.util.Random;

public class randomNumbers2_18 {
    public static void main(String[] args) {

        // creates a new random number generator object named randGen
        Random randGen = new Random();

        // Printing 2 random numbers WITHOUT a defined range.
        System.out.println("No defined range for random numbers");
        System.out.println(randGen.nextInt());
        System.out.println(randGen.nextInt());

        // Printing 2 random numbers with a maximum number of values
        System.out.println("Range for random numbers = 0 - 10 with 11 passed as the nextInt() argument");
        // Argument passed into nextInt() specifies the number of possible values ( 0 to N - 1)
        System.out.println(randGen.nextInt(11));
        System.out.println(randGen.nextInt(11));


        // Specific ranges

        // Specific range of 10 possible values starting with 5
        // 11 passed as the nextInt() argument = 11 possible values
        // + 5 = start at 5. Specific range = 5 to 15
        System.out.print("Specific range between 5 to 15: ");
        // 11 passed as argument = 11 possible values. + 5 = range starts at 5
        System.out.println(randGen.nextInt(11) + 5);



        //Set a specific random seed for Random Generator
        System.out.println("Seed has been set with a specific seed Program will yield same sequence of pseudo-random numbers");
        Random randGen2 = new Random(15);  // Set Seed with 15

        System.out.println(randGen2.nextInt());
        System.out.println(randGen2.nextInt());
        System.out.println(randGen2.nextInt());




    }
}
