package practice2;

public class ArraySort2D {

    public static void main(String[] args) {
        int[][] arr = {
            {7, 4, 9, 2},
            {8, 4, 7, 1},
            {5, 8, 2, 6}
        };
        getSort(arr);

    }

    public static void getSort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        int swap = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = swap;
                    }
                }
            }
        }
        for (int[] oneD : m) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }

}
