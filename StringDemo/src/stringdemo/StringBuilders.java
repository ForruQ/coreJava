
package stringdemo;

/* defference between String  and stringBuilder : String is static. 
on the other hand stringBuilder is dynamic. That means string is not changable but
StringBuilder can be changed.
*/

public class StringBuilders {
    public static void main(String[] args) {
        String name = "Forruq Ahammed";
        // creating StringBuilder and instantiate value;
        StringBuilder sbr = new StringBuilder(name);
        System.out.println("StringBuilder sbr = " + sbr);
        
        // reverse method 
        sbr.reverse();
        System.out.println("reverse method of sbr = " + sbr);
        
        int str = 120;
        String s = Integer.toString(str);
        System.out.println("String str = " + s);
    }
    
}
