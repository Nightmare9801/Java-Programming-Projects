package school.project; // Package declaration for the class

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * This class is a java application that calculates the electricity bill for consumers based on the 
 * units consumed.
 * 
 * @author Navonil Mandal
 * @version 1.0 
 */

public class ElectricityBillCalculator { // Class declaration
    /**
     * Main method to perform ui operations and print the consumer details.
     * Users can enter 'Exit' to exit.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Using try-with-resources for auto-closing the Scanner
            String consumerName; // Variable to store consumer name
            int consumerNumber; // Variable to store consumer number
            String month; // Variable to store the month
            int unitsConsumed; // Variable to store units consumed
            
            // Infinite loop to keep reading input until 'Exit' is entered
            for (;;) {
                // Prompt the user to enter the necessary details
                System.out.println("Enter consumer name, number, month, and units consumed or type 'Exit' to exit the program:");
                consumerName = scanner.next(); // Read consumer name
                
                // Check if user wants to exit the program
                if(consumerName.equalsIgnoreCase("Exit")){
                    break; // Exit mechanism
                }
                
                consumerNumber = scanner.nextInt(); // Read consumer number
                month = scanner.next(); // Read month
                unitsConsumed = scanner.nextInt(); // Read units consumed
                
                // Calculate the bill amount based on units consumed
                double billAmount = getBill(unitsConsumed); // Method call to get the bill amount
                
                // Display the bill details
                System.out.println("--- Electricity Bill ---");
                System.out.println("Consumer Name: " + consumerName); // Print consumer name
                System.out.println("Consumer Number: " + consumerNumber); // Print consumer number
                System.out.println("Month: " + month); // Print the month
                System.out.println("Units Consumed: " + unitsConsumed); // Print the units consumed
                System.out.println("Bill Amount: ₹"+ billAmount); // Display bill amount in Indian Rupees
            }
        }
    }

    /**
     * Method to calculate the bill amount based on units consumed
     * 
     * @param unitsConsumed It is the no. of units consumed on the basis of which the bill is calculated
     * 
     * @return It returns the bill calculated on the no. of units consumed
    */
    private static double getBill(int unitsConsumed) {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 1.80; // Calculate bill amount for 100 units
        } else if (unitsConsumed <= 300) {
            return unitsConsumed * 2.30; // Calculate bill amount for 101 to 300 units
        } else if (unitsConsumed <= 500) {
            return unitsConsumed * 2.80; // Calculate bill amount for 301 to 500 units
        }
        return unitsConsumed * 3.50; // Calculate bill amount for units beyond 500
    }
}
