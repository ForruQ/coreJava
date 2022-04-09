package evidence39;

import java.util.Scanner;

public class Result {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        switch (number) {
            case 90:
                System.out.println("A+");
                break;
            case 80:
                System.out.println("A");
                break;
            case 70:
                System.out.println("A-");
                break;
            case 60:
                System.out.println("B+");
                break;
            case 50:
                System.out.println("B");
                break;
            case 40:
                System.out.println("B-");
                break;
            case 33:
                System.out.println("c");
                break;

            default:
                System.out.println("Fail");
        }
    }

}
