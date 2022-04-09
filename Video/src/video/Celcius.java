
package video;

import java.util.Scanner;


public class Celcius {
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in);
        Double cels, feren;
        
        System.out.print("Enter Ferenhite Temperature: ");
        feren= input.nextDouble();
        
        cels =1.8 * (feren - 32);
        System.out.println("Celcius Temperature is " + cels);
    }
    
}
