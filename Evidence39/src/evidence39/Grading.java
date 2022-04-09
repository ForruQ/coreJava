package evidence39;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();

        switch (num) {
            case 90:
                System.out.println("A+");
                break;
            case 80:
                System.out.println("A+");
                break;

            case 70:
                System.out.println("A");
                break;
            case 60:
                System.out.println("A");
                break;
            case 50:
                System.out.println("A-");
                break;
            case 40:
           System.out.println("B");
                break;
            default:
                    System.out.println("F");
        }
    }
}
