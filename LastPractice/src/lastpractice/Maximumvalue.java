
package lastpractice;

import java.util.Scanner;


public class Maximumvalue {
    public static void main(String[] args) {
        getMax();
    }
    public static void getMax() {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        int max = num;
        while(num != -1){
            while(max < num ) {
                max = num;
            }
            num = s.nextInt();
        }
        System.out.println("max is " + max);
    }
}
