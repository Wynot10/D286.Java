import java.util.Scanner;

public class floatingPointNumbers2_7 {
    public static void main(String[] args) {


        // Travel time Program

        System.out.println("Default output of pi: " + Math.PI);
        System.out.print("pi reduced to 4 digits after the decimal: ");
        // Manipulating how numbers are output will be discussed in detail elsewhere
        System.out.printf("%.4f\n", Math.PI);

        Scanner scnr = new Scanner(System.in);
        double milesTravel; // User input of miles to travel
        double hoursFly;    // Travel hours if flying those miles
        double hoursDrive;  // Travel hours if driving those miles

        System.out.print("Enter distance in miles: ");
        milesTravel = scnr.nextDouble();

        hoursFly   = milesTravel / 500.0;
        hoursDrive = milesTravel / 60.0;

        System.out.println(milesTravel + " miles would take:");
        System.out.println("   " + hoursFly + " hours to fly,");
        System.out.println("   " + hoursDrive + " hours to drive.");

        // Gas oil Mixture Ratio Program
        double gasVolume;
        double oilVolume;
        double mixRatio;

        System.out.print("Enter gas volume: ");
        gasVolume = scnr.nextDouble();

        System.out.print("Enter oil volume: ");
        oilVolume = scnr.nextDouble();

        //If dividend and divisor are both 0, result will be NaN (Not a Number)
        // Dividing a double by 0 result will be infinity or - infinity depending on the signs of the operand
        mixRatio = gasVolume / oilVolume;

        System.out.print("Gas to oil mix ratio is " + mixRatio + ":1");
    }
}
