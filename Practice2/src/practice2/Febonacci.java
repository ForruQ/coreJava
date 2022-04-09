package practice2;

import java.util.Scanner;

public class Febonacci {

    public static void main(String[] args) {
        getFebo();
    }

    public static void getFebo() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get Febonacci series");
        int num = input.nextInt();

        for (int a = 0, b = 1, c = 0; c <= num; a = b, b = c, c = a + b) {
            System.out.print(c + " ");
        }
    }

}
