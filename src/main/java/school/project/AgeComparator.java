package school.project;

import java.util.Scanner;

public class AgeComparator {
    public static final int getOldest(int age1, int age2, int age3) {
        return Math.max(age1, Math.max(age2, age3));
    }

    public static final int getYoungest(int age1, int age2, int age3) {
        return Math.min(age1, Math.min(age2, age3));
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int age1, age2, age3;
            for (;;) {
                System.out.println("Enter the ages or type '-1' to exit.");
                age1 = in.nextInt();
                if(age1==-1){
                    break;
                }
                age2 = in.nextInt();
                age3 = in.nextInt();
                System.out.println("The oldest person is: " + getOldest(age1, age2, age3));
                System.out.println("The youngest person is: " + getYoungest(age1, age2, age3));
            }
        }
    }
}

