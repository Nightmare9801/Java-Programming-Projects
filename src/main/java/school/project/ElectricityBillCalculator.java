package school.project;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter consumer name, number, month, and units consumed:");
            String consumerName = scanner.next();
            int consumerNumber = scanner.nextInt();
            String month = scanner.next();
            int unitsConsumed = scanner.nextInt();
            
            
            double billAmount = getBill(unitsConsumed);
            
            System.out.println("--- Electricity Bill ---");
            System.out.println("Consumer Name: " + consumerName);
            System.out.println("Consumer Number: " + consumerNumber);
            System.out.println("Month: " + month);
            System.out.println("Units Consumed: " + unitsConsumed);
            System.out.printf("Bill Amount: ₹%.2f%n", billAmount);
        }
    }

    private static double getBill(int unitsConsumed) {
        double billAmount;
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.80;
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 1.80 + (unitsConsumed - 100) * 2.30;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1.80 + 200 * 2.30 + (unitsConsumed - 300) * 2.80;
        } else {
            billAmount = 100 * 1.80 + 200 * 2.30 + 200 * 2.80 + (unitsConsumed - 500) * 3.50;
        }
        return billAmount;
    }
}

