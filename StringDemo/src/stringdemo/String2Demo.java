package stringdemo;

public class String2Demo {

    public static void main(String[] args) {
        String firstName = "Forruq ";
        String lastName = "Ahmed";
        String fullName = firstName.concat(lastName);
        System.out.println("FullName is " + fullName);
        System.out.println("fullName with UpperCase is "+ fullName.toUpperCase());
        System.out.println("fullName with lowerCase is "+ fullName.toLowerCase());
        System.out.println("Check StartWith "+ firstName.startsWith("F") );
        System.out.println("Check EndsWith "+ lastName.endsWith("d") );
       
    }

}
