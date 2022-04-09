
package practice3;

import java.util.Scanner;


public class Sum {
public static void main(String[] args) {
        System.out.println(getSum10Num());
    }

    public static int getSum10Num() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}
