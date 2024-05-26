package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * A class to calculate the bonus amount for employees based on their salary and years of service.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */
public class EmployeeBonusCalculator {
    
    /**
     * Main method to input the salary and years of service for employees and calculate the bonus amount.
     * The user can enter the salary and years of service or enter '-1' to exit the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Using try-with-resources for auto-closing the Scanner
            double salary, bonus; // Variables to store the salary and bonus
            int yearsOfService; // Variable to store the years of service
            // Infinite loop to keep reading input until '-1' is entered
            for (;;) {
                // Prompt the user to enter the necessary details
                System.out.println("Please enter the salary and years of service or enter '-1' to exit:");
                salary = scanner.nextDouble(); // Read the salary
                if (salary == -1) {
                    break; // Exit the loop if the user enters -1
                }
                yearsOfService = scanner.nextInt(); // Read the years of service
                
                bonus = getBonus(salary, yearsOfService); // Method call to get bonus
                
                System.out.println("Net bonus amount: Rs" + bonus); // Print the bonus
            }
        }
    }

    /**
     * Calculates the bonus amount for an employee based on their salary and years of service.
     * If the years of service are more than 5, a bonus of 5% of the salary is added.
     *
     * @param salary The salary of the employee
     * @param yearsOfService The years of service of the employee
     * @return The total bonus amount for the employee
     */
    public static final double getBonus(double salary, int yearsOfService) {
        if (yearsOfService > 5) {
            return 1.05 * salary; 
        }
        return salary;
    }
}
