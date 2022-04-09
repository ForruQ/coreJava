package practices;

public class SortArray2D {
    public static void main(String[] args) {
        int [][] arr = {
            {3, 1, 5, 4, 9},
            {7, 2, 6, 9, 3},
            {8, 3, 5, 7, 1},
            {9, 6, 5, 2, 11}
        };
        getSort(arr);
    }

    public static void getSort(int[][] twoD) {

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                for (int k = 0; k < twoD[i].length - j - 1; k++) {
                    if (twoD[i][k] > twoD[i][k + 1]) {
                        int t = twoD[i][k];
                        twoD[i][k] = twoD[i][k + 1];
                        twoD[i][k + 1] = t;
                    }

                }

            }

        }

        for (int[] oneD : twoD) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

}
