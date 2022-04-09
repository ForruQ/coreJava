package video;

import java.util.Scanner;

public interface PrintMatrinx {

    public static void main(String[] args) {
        getMatrix();
    }

    public static void getMatrix() {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        System.out.println("Enter Elements for a");
        for (int row = 0; row < a.length - 1; row++) {
            for (int col = 0; col < a[row].length - 1; col++) {
                System.out.printf("a[%d][%d] =", row, col);
                a[row][col]= input.nextInt();
                
            }
        }
         System.out.println("Enter Elements for b");
        for (int row = 0; row < a.length - 1; row++) {
            for (int col = 0; col < a[row].length - 1; col++) {
                System.out.printf("b[%d][%d] =", row, col);
                b[row][col]= input.nextInt();
                
            }
        }
        for (int row = 0; row < a.length - 1; row++) {
            for (int col = 0; col < a[row].length - 1; col++) {
                System.out.print(a[row]);
                
            }
            System.out.println("");
        }
    }

}
