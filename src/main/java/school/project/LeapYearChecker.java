package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * A class to check if a given year is a leap year.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */
public class LeapYearChecker { // Class declaration
    
    /**
     * Checks if a year is a leap year based on the rules of the Gregorian calendar.
     *
     * @param year The year to be checked
     * @return true if the year is a leap year, false otherwise
     */
    public static final boolean isLeapYear(int year) {
        return ( (year % 400 == 0) || ( (year % 100 != 0) && (year % 4 == 0) ) );
    }
    
    /**
     * Main method to perform ui operations and determine if a year is a leap year or not.
     * The user can '-1' to exit the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int year; // Declare the variables to store the year
            // Infinite loop to keep reading input until '-1' is entered
            while (true) {
                // Prompt the user to enter the necessary details
                System.out.println("Enter a year to check if it's a leap year or enter '-1' to exit:");
                year = in.nextInt(); // Read the year
                if (year == -1) {
                    break; // Exit mechanism
                }
                System.out.println(isLeapYear(year)); // Check if the year is a leap year
            }
        }
    }
}
