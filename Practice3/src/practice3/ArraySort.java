
package practice3;


public class ArraySort {
    
    public static void main(String[] args) {
        int[] arr = {6, 2, 9, 7};
        getSort(arr);
    }
    public static void getSort(int[] m){
        for (int i = 0; i < m.length; i++) {
               for (int j = 0; j < m.length- i - 1; j++) {
                   
                       if(m[i] > m[i +1]) {
                           int swap = m[i];
                           m[i]= m[i+1];
                           m[i+1] = swap;
                      
                   }
            }
               for(int num : m) {
                   System.out.print(num + " ");
               }
        }
    }
    
}
