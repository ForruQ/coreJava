
package practices;


public class Sorting2D {
    
    public static void main(String[] args) {
        int[][] arr = {
            {5, 7, 3, 6},
            {6, 3, 9, 2},
            {5, 7, 3, 6},
            {6, 3, 9, 2}
        };
        getSort(arr);
    }
    public static void getSort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m.length - j -1; k++) {
                    if(m[i][k] > m[i][k + 1]) {
                        int s = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1]= s;
                    }
                    
                }
                
            }
            
        }
        for(int[] oneD : m){
            for(int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
