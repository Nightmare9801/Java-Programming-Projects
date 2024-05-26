package school.project;

import java.util.Scanner; // Importing the Scanner class for user input

/**
 * The SelectiveDivisibiltyChecker program is a java application that tests whether a number is 
 * divisible by 3 and 5.
 * 
 * @author Navonil Mandal
 * @version 1.0 
 */

public class SelectiveDivisibilityChecker { // Class Declaration 
    /**
     * This method checks the selective divisibility of a number by two other numbers.
     * It prints a message based on whether the number is divisible by the two given numbers or not.
     * 
     * @param x The number to be checked for divisibility.
     * @param y The first number to check divisibility with.
     * @param z The second number to check divisibility with.
     */
    public static final void checkSelectiveDivisibility(int x, int y, int z){
        // Check the divisibility of the number 'x' with respect to 'y' and 'z' and print it
        if(x%y==0&&x%z==0){
            System.out.println(x+" is divisible by both " + y + " and " +z);
        }else if(x%y==0){
            System.out.println(x+" is divisible by " + y + " but not by " + z);
        }else if(x%z==0){
            System.out.println(x+" is divisible by " + z + " but not by " + y);
        }else{
            System.out.println(x+" is neither divisible by " +y+" nor by " +z);
        }
    }
    /**
     * Main method to perform the ui operations to check the divisibility.
     * Users can enter '-Infinity' to exit.
     * 
     * @param args Command line arguments (not used in this program) 
     */
    public static void main(String[] args) { 
        try (Scanner in = new Scanner(System.in)) { // Using try-with-resources for auto-closing the Scanner
            int no; // Variable to store the number to be checked
            
            // Infinite loop to keep reading input until '-Infinity' is entered
            while(true){
                // Prompt the user to enter the necessary details
                System.out.println("Pls enter the number or type '-Infinity' to exit");
                no= in.nextInt(); // read the number
                if(no==(int)Double.NEGATIVE_INFINITY){
                    break; // Escape Mechanism
                }
                checkSelectiveDivisibility(no, 3, 5); // Method call to check the divisibility
            }
        }
    }
}
