package school.project;

import java.util.Scanner;

public class SelectiveDivisibilityChecker {
    public static final void checkSelectiveDivisibility(int x, int y, int z){
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
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int no;
            while(true){
                System.out.println("Pls enter the number or type '-Infinity' to exit");
                no= in.nextInt();
                if(no==(int)Double.NEGATIVE_INFINITY) break;
                checkSelectiveDivisibility(no, 3, 5);
            }
        }
    }
}
