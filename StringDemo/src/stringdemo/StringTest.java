
package stringdemo;


public class StringTest {
    public static void main(String[] args) {
        String s1 = "Forruq Ahammed";
        String s2 = new String("Forruq Ahammed");
        String s3 = new String("forruq ahammed");
        
        
        System.out.println("S1 = " + s1);
        System.out.println("S1 = " + s2);
        System.out.println("S2 = " + s3);
        
        System.out.println("Length of s1 is  "+ s1.length());
        System.out.println("Length of s2 is  "+ s2.length());
        System.out.println("Length of s3 is  "+ s3.length());
        
        //equality check with wrong formulae
        if(s1 == s2){
            System.out.println("equals"); 
        } else{
            System.out.println("Not equal");
        }
         //equality check with Right formulae
        if(s1.equals(s2)){
            System.out.println("equals"); 
        } else{
            System.out.println("Not equal");
        }
        //equlaity check with case sensitive 
        if(s1.equals(s3)){
            System.out.println("equals"); 
        } else{
            System.out.println("Not equal");
        }
        
        //equality check with ignore case formulae
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("equals"); 
        } else{
            System.out.println("Not equal");
        }
        
        // contains method
        
        System.out.println("S1 contains " + s1.contains("Forruq"));
        
    }
    
}
