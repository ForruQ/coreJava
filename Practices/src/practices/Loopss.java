package practices;

public class Loopss {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                continue;
            }

            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println(" Swarna");

            }
            if (i == 91) {
                break;
            }
        }
    }

}
