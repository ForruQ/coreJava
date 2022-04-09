package stringdemo;

public class String3Demo {

    public static void main(String[] args) {
        String country = "Bangladesh is my country";
        System.out.println(country);
        
        // use of charAt. It returns the Character for index no.
        System.out.println("country.charAt(5) = " +country.charAt(5));
        
        // use of codePointAt retruns the code number of the charater for index no.
        System.out.println("country.codePointAt(0) = " + country.codePointAt(0));
        
        // use of index of method
        System.out.println("country.indexOf('n') = "+ country.indexOf('n'));
        // use of lastIndexOf method
        System.out.println("country.lastIndexOf('n') = "+ country.lastIndexOf('n'));
        
        
        String s1 = "   bangladesh is my country     ";
        System.out.println("S1 " + s1);
        
        // trim method deletes all spaces from first and last position, not in middle
        System.out.println("s1.trim() = " + s1.trim());
        
        // replace method
        System.out.println("Replace method " + country.replace("country", "desh"));
        
       String[] s3 = country.split(" ");
       for(String n : s3){
           System.out.println(n);
       }
    }

}
