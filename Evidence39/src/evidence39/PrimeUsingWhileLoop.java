
package evidence39;


public class PrimeUsingWhileLoop {
    public static void main(String[] args) {
        int num = 4;
        int i = 2;
        boolean isPrime = false;
        while(i<=num/2) {
            if(num%i == 0){
                isPrime = true;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println("Not a prime number");
        } else {
            System.out.println("Prime number");
        }
    }
    
}
