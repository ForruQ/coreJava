
package video;

import java.util.Scanner;


public class Video {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter base: ");
        base = input.nextDouble();
        
        System.out.print("Enter heght: ");
        height = input.nextDouble();
        
        area= .5* base * height;
        System.out.println("Area of the triangle:" + area);
    }
    
}
