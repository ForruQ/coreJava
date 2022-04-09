package chh5;

public class Practise {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 9 == 0) {
                break;
            }
            
            System.out.print(i + " ");
            if(i % 10 == 0) {
                System.out.println("");
            }
        }

    }

}
