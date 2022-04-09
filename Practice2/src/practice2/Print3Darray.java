
package practice2;


public class Print3Darray {
    public static void main(String[] args) {
        int[][][] arr = {
            {{3, 7, 4, 1}, {7, 2, 6, 5} },
            {{3, 7, 4, 1}, {7, 2, 6, 5} }
        };
        getPrint(arr);
    }
    
    public static void getPrint(int[][][] threeD) {
        for(int[][] twoD : threeD) {
            for(int[] oneD : twoD) {
                for(int num : oneD) {
                    System.out.print(num + " ");
                }
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    
}
