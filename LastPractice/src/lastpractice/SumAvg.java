package lastpractice;

import java.util.Scanner;

public class SumAvg {

    public static void main(String[] args) {

getAvg();
    }

    public static void getSum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = s.nextInt();
        int sum = 0;

        while (num != -1) {
            sum += num;
            num = s.nextInt();
        }
        System.out.println(sum);
    }
     public static void getAvg() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number ");
        double num = s.nextDouble();
        double sum = 0;
        
        double count= 0;

        while (num != -1) {
            sum += num;
            num = s.nextDouble();
            count++;
        }
        System.out.println("average is "+ sum/count);
    }
}




