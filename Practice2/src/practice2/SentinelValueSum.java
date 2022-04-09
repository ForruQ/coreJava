package practice2;

import java.util.Scanner;

public class SentinelValueSum {

    public static void main(String[] args) {
        getSum();
    }

    public static void getSum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers");
        double num = input.nextDouble();
        double sum = 0;
        for (int i = 1; num != -1; i++) {
            sum += num;
            num = input.nextDouble();
        }
        System.out.println("Sum is " + sum);

    }
}
