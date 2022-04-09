package evidence39;

import java.util.Scanner;

public class SumLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numbr = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= numbr; i++) {
            sum += i;
        }
        System.out.println("sum is " + sum);
    }
}
