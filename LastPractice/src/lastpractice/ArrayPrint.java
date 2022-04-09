package lastpractice;

public class ArrayPrint {

    public static void main(String[] args) {
        int[][] arr = {
            {8, 4, 0, 6},
            {6, 9, 8, 4}
        };
        getPrint(arr);
        System.out.println(" ");
        getSort(arr);
    }

    public static void getSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int swap = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = swap;

                    }

                }

            }

        }
        for (int[] oneD : arr) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
    }

    public static void getPrint(int[][] arr) {

        for (int[] oneD : arr) {
            for (int num : oneD) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
