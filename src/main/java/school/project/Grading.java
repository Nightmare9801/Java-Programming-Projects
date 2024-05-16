package school.project;

import java.util.Scanner;

class Grading {
    public static final String getGrade(int marks) {
        if (marks < 25) {
            return "F";
        } else if (marks < 45) {
            return "E";
        } else if (marks < 50) {
            return "D";
        } else if (marks < 60) {
            return "C";
        } else if (marks < 80) {
            return "B";
        }
        return "A";
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Please enter the marks or enter '-1' to exit:");
                int marks = in.nextInt();
                if (marks==-1) {
                    break;
                }
                String grade= getGrade(marks);
                System.out.println("You got a " + grade + ".");
            }
        }
    }

    
}
