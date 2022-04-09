package evidence39;

public class PrimeWithForLoop {

    public static void main(String[] args) {
        int number = 21;
        boolean isPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println("Not a Prime number");
        } else {
            System.out.println("Prime number");

        }
    }

}
