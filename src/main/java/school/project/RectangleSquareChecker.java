package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * This class is a java application that checks if a given rectangle is actually a square based on its 
 * dimensions.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */
public class RectangleSquareChecker { // Class declaration
    
    /**
     * Checks if a rectangle is actually a square by comparing its length and breadth.
     *
     * @param length The length of the rectangle
     * @param breadth The breadth of the rectangle
     * @return true if the rectangle is a square, false otherwise
     */
    public static final boolean isSquare(int length, int breadth) {
        return length == breadth;
    }

    /**
     * Main method to perform ui operations and determine if a rectangle is a square or not.
     * The user can enter '-1' to exit the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int length, breadth; // Declare variables to store the length and breadth
            // Infinite loop to keep reading input until '-1' is entered
            while (true) {
                // Prompt the user to enter the necessary details
                System.out.println("Enter the length and breadth of the rectangle (or enter -1 to exit):");
                length = in.nextInt(); // Read the length
                if (length == -1) {
                    break; // Exit mechanism
                }
                breadth = in.nextInt(); // Read the breadth
                // Check and print whether it is a square or not
                if (isSquare(length, breadth)) {
                    System.out.println("It is a square");
                } else {
                    System.out.println("It is not a square");
                }
            }
        }
    }
}
