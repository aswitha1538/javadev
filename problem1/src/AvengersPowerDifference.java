 import java.util.Arrays;
import java.util.Scanner;

public class AvengersPowerDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // Number of Avengers
        int[] powers = new int[N];

        for (int i = 0; i < N; i++) {
            powers[i] = scanner.nextInt();  // Read the power of each Avenger
        }

        // Sort the avengers' powers in ascending order
        Arrays.sort(powers);

        // Initialize variables to keep track of Iron Man's and Captain America's team powers
        int ironManPower = 0;
        int captainAmericaPower = 0;

        // Initialize a flag to determine which team starts first (Iron Man or Captain America)
        boolean ironManStarts = true;

        // Iterate through the avengers' powers
        for (int i = N - 1; i >= 0; i--) {
            // If it's Iron Man's turn, add the avenger's power to his team
            if (ironManStarts) {
                ironManPower += powers[i];
            }
            // Otherwise, add the avenger's power to Captain America's team
            else {
                captainAmericaPower += powers[i];
            }

            // Switch the turn to the other team
            ironManStarts = !ironManStarts;
        }

        // Calculate the difference in powers between the two teams
        int powerDifference = ironManPower - captainAmericaPower;

        // Print the power difference
        System.out.println(powerDifference);
    }
}
