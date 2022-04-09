package chh2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
        for (int i = 1; i < 5; i++) {

            int a = input.nextInt();

            if (a % 2 == 0) {
                System.out.println(a + " is even");
            } else {
                System.out.println("Odd");
            }

        }
    }

}
