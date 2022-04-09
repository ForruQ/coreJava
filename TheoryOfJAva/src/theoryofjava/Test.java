
package theoryofjava;


public class Test extends Calculation {
    public void multiplication(int x, int y) {
     int z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }
	
   public static void main(String args[]) {
      int a = 20, b = 10;
      Test demo = new Test();
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
   }
    
}
