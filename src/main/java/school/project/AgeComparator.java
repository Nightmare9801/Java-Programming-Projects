package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * This class is a java application that compares ages and find the oldest and youngest person among 
 * three people.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */

public class AgeComparator { // Class declaration

    /**
     * Returns the oldest age among three given ages.
     *
     * @param age1 First person's age
     * @param age2 Second person's age
     * @param age3 Third person's age
     * @return The oldest age among the three ages
     */
    public static final int getOldest(int age1, int age2, int age3) {
        return Math.max(age1, Math.max(age2, age3));
    }

    /**
     * Returns the youngest age among three given ages.
     *
     * @param age1 First person's age
     * @param age2 Second person's age
     * @param age3 Third person's age
     * @return The youngest age among the three ages
     */
    public static final int getYoungest(int age1, int age2, int age3) {
        return Math.min(age1, Math.min(age2, age3)); // Performs the 
    }

    /**
     * Main method to take user input for three ages and find the oldest and youngest person.
     * User can enter ages or type '-1' to exit the program.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { // Using try-with-resources for auto-closing the Scanner
            int age1, age2, age3; // Variables to store the ages

            // Infinite loop to keep reading input until '-1' is entered
            for (;;) {
                // Prompt the user to enter the necessary details
                System.out.println("Enter the ages or type '-1' to exit.");
                age1 = in.nextInt(); // Read 1st age
                if (age1 == -1) {
                    break; // Escape Mechanism
                }
                age2 = in.nextInt(); // Read 2nd age
                age3 = in.nextInt(); // Read 3rd age
                System.out.println("The oldest person is: " + getOldest(age1, age2, age3)); // Print the oldest age
                System.out.println("The youngest person is: " + getYoungest(age1, age2, age3)); // Print the youngest age
            }
        }
    }
}
