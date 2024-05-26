package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * This class is a java application that determines the grade based on marks entered by the user.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */
class Grading { // Class Declaration

    /**
     * Returns the grade based on the marks provided.
     *
     * @param marks The marks obtained by a student
     * @return The grade corresponding to the marks
     */
    public static final String getGrade(int marks) {
        // Check the grade depending on the marks
        if (marks < 25) {
            return "F";
        } else if (marks < 45) {
            return "E";
        } else if (marks < 50) {
            return "D";
        } else if (marks < 60) {
            return "C";
        } else if (marks < 80) {
            return "B";
        }
        return "A";
    }

    /**
     * Main method to take user input for marks and determine the grade.
     * User can enter '-1' to exit the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { // Using try-with-resources for auto-closing the Scanner
            // Infinite loop to keep reading input until '-1' is entered
            while (true) {
                // Prompt the user to enter the necessary details
                System.out.println("Please enter the marks or enter '-1' to exit:");
                int marks = in.nextInt(); // Read the marks
                if (marks == -1) {
                    break; // Escape Mechanism
                }
                String grade = getGrade(marks); // Method call to get the grade
                System.out.println("You got a " + grade + "."); // Print the grade
            }
        }
    }
}
