package school.project; 

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * The NatureOfQuadraticRootsFinder program is a java application that finds the nature of the roots 
 * of a quadratic equation based on the coefficients.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */

public class NatureOfQuadraticRootsFinder { // Class declaration
    /**
     * Main method to perform the ui operations to check the nature of the roots.
     * Users can enter '-Infinity' to exit.
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {// Using try-with-resources for auto-closing the Scanner
            double a, b, c; //Initialize the variables
            
            // Infinite loop to keep reading input until '-Infinity' is entered
            for (;;) {
                // Prompt the user to enter the necessary details
                System.out.println("Enter a, b, and c for the quadratic equation (ax^2 + bx + c = 0) or type '-Infinity' to exit:");
                a = scanner.nextDouble(); // Read 1st coefficient
                if(a==Double.NEGATIVE_INFINITY){ 
                    break; //Exit Mechanism
                }
                b = scanner.nextDouble(); // Read 2nd coefficient
                c = scanner.nextDouble(); // Read 3rd coefficient
                findNature(a, b, c); // Method call to check the discriminant
            }
        }
    }

    /**
     * Method to determine the nature of roots based on the discriminant
     * 
     * @param a Value of the 1st coefficient
     * @param b Value of the 2nd coefficient
     * @param c Value of the 3rd coefficient
     *  
     */
    private static void findNature(double a, double b, double c) {
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        
        // Check discriminant to determine the nature of roots and print the results
        if (discriminant > 0) {
            System.out.println("Roots are real and unequal");
        } else if (discriminant == 0) {
            System.out.println("Roots are real and equal");
        } else {
            System.out.println("Roots are imaginary and unequal");
        }
    }
}


