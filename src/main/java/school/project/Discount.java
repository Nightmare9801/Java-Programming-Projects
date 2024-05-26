package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * A class to calculate the total cost with or without discount based on the quantity of items.
 * 
 * @author Navonil Mandal
 * @version 1.0
 */
public class Discount { // Class declaration

    /**
     * Calculates the discounted price based on the discount percentage and original cost.
     *
     * @param discount The discount percentage
     * @param cost The original cost of the items
     * @return The discounted price after applying the discount
     */
    public static final int calculateDiscountedPrice(int discount, int cost) {
        return cost * (1 - (discount / 100));
    }

    /**
     * Main method to perform ui operations and calculate the total cost based on the quantity of items 
     * and apply discount if applicable.
     * User can enter '-1' to exit the program.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int costPerArticle = 100; // Predefined cost per article
        int discount = 10; // Predefined discount percentage
        try (Scanner in = new Scanner(System.in)) { // Using try-with-resources for auto-closing the Scanner
            // Infinite loop to keep reading input until '-1' is entered
            while (true) {
                // Prompt the user to enter the necessary details
                System.out.println("Please enter the quantity or type '-1' to exit:");
                int qty = in.nextInt(); // Read the quantity
                if (qty == -1) {
                    break; // Escape mechanism
                }
                int cost = qty * costPerArticle; // Calculate the cost without discount
                if (cost < 1000) {
                    System.out.println("The total cost is: Rs. " + cost); // Print the cost 
                } else {
                    int costWithDiscount = calculateDiscountedPrice(discount, cost); // Method call to calculate the discounted cost
                    System.out.println("The total cost is: Rs. " + costWithDiscount); // Print the cost with discount
                }
            }
        }
    }
}
