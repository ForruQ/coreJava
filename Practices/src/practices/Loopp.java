package practices;

public class Loopp {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i == 90) {
                System.out.println("End");
            }
            if(i % 11 == 0) {
                System.out.println(" swarna");
            }
            if (i == 90) {
                break;
                
            }
            if (i % 7 == 0) {
                continue;
               }
            System.out.print(i + " ");
            
            
            
        }
    }
}
