import java.util.Scanner;

public class constantVariables2_9 {
    public static void main (String[] args) {
        // Estimates distance of lightning based on seconds
        // between lightning and thunder

        Scanner scnr = new Scanner(System.in);
        // Final variables make the variable a constant and cannot be re-assigned later in the program
        final double SPEED_OF_SOUND   = 761.207; // Miles/hour (sea level)
        final double SECONDS_PER_HOUR = 3600.0;  // Secs/hour
        double secondsBetween;
        double timeInHours;
        double distInMiles;

        System.out.println("Enter seconds between");
        System.out.print("lightning strike and thunder: ");
        secondsBetween = scnr.nextDouble();

        timeInHours = secondsBetween / SECONDS_PER_HOUR;
        distInMiles = SPEED_OF_SOUND * timeInHours;

        System.out.println("Lightning strike was approximately");
        System.out.println(distInMiles + " miles away.");


    }
}
