package school.project;

import java.util.Scanner;

public class RectangleSquareChecker {
    
    public static final boolean isSquare(int length, int breadth) {
        return length == breadth;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int length, breadth;
            while (true) {
                System.out.println("Enter the length and breadth of the rectangle (or enter -1 to exit):");
                length = in.nextInt();
                if (length == -1) {
                    break; // Exit the loop if the user enters -1
                }
                breadth = in.nextInt();
                if (isSquare(length, breadth)) {
                    System.out.println("It is a square");
                } else {
                    System.out.println("It is not a square");
                }
            }
        }
    }
}

