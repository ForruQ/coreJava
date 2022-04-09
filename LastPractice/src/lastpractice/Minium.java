package lastpractice;

import java.util.Scanner;

public class Minium {

    public static void main(String[] args) {
        getMin();
    }

    public static void getMin() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = s.nextInt();
        int min = num;
        while (num != -1) {
            while (min > num) {
                min = num;
            }

            num = s.nextInt();
        }
        System.out.println("Min is " + min);
    }
}
