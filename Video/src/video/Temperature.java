
package video;

import java.util.Scanner;


public class Temperature {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Double cels, feren;
        Double a= 9.0;
        Double b= 5.0;
        Double c= a/b;
        System.out.println(c);
        System.out.print("Enter Celcius: ");;
        cels = input.nextDouble();
        
        
        
        feren = c * cels + 32;
        System.out.println("Ferenhite temperature is " + feren);
        
        
        
        
    }
    
}
