package school.project;

import java.util.Scanner;

public class LeapYearChecker {
    public static final boolean isLeapYear(int year){
        return ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0));
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int year;
            while (true) {
                System.out.println("Enter a year to check if it's a leap year (or enter 0 to exit):");
                if (in.hasNextInt()) {
                    year = in.nextInt();
                    if (year == 0) {
                        break;
                    } else if (year > 0) {
                        System.out.println(isLeapYear(year));
                    } else {
                        System.out.println("Please enter a valid positive year.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid year.");
                    in.next(); 
                }
            }
        }
    }
}
