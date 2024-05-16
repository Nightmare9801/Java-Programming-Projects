package school.project;

import java.util.Scanner;

public class NatureOfQuadraticRootsFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a, b, c;

            for (;;) {
                System.out.println("Enter a, b, and c for the quadratic equation (ax^2 + bx + c = 0) or type '-Infinity' to exit:");
                a = scanner.nextDouble();
                if(a==Double.NEGATIVE_INFINITY) break;
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                findNature(a, b, c);
            }
        }
    }

    private static void findNature(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            System.out.println("Roots are real and unequal");
        }
        else if (discriminant == 0) {
            System.out.println("Roots are real and equal");
        }
        else {
            System.out.println("Roots are imaginary and unequal");
        }
    }
}

