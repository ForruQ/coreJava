
package palindromm;

import java.util.Scanner;


public class Palindromm {

    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word");
        
        String givenText = sc.next();
        StringBuilder sb = new StringBuilder(givenText);
        sb.reverse();
        boolean ns = sb.toString().equalsIgnoreCase(givenText) ? true : false ;
            System.out.println("Palindrom for the text is   " + ns);       
        
        
        
        
    }
    
}
