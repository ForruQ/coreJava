
package theoryofjava;


public class Calculation {
    int z;
	
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
       Calculation ab = new Calculation();
        ab.addition(20, 10);
    }
    
}
