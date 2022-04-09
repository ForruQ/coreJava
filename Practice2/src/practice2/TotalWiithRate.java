package practice2;

import java.util.Scanner;

public class TotalWiithRate {

    public static void main(String[] args) {
        getTotal();
    }

    public static void getTotal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a amount");
        double amount = input.nextDouble();

        System.out.println("Enter a Rate");
        double rate = input.nextDouble();

        System.out.println("Enter a year");
        double year = input.nextDouble();
        double total = amount * Math.pow(1 + rate, year);
        System.out.println(total);
    }

}
