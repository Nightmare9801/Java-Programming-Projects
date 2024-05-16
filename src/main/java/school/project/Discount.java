package school.project;

import java.util.Scanner;

public class Discount {
    public static final int calculateDiscountedPrice(int discount, int cost) {
        return cost*(1-(discount / 100));
    }
    public static void main(String[] args) {
        int costPerArticle = 100;
        int discount = 10;
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter the quantity or type '-1' to exit:");
                int qty = in.nextInt();
                if(qty==-1){
                    break;
                }
                int cost = qty * costPerArticle;
                    
                if (cost < 1000) {
                    System.out.println("The total cost is: Rs. " + cost);
                } else {
                    int costWithDiscount = calculateDiscountedPrice(discount, cost);
                    System.out.println("The total cost is: Rs. " + costWithDiscount);
                }
            }
        }
    }

    
}

