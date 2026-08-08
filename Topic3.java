import java.util.*;

public class Topic3 {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exitPointOfMatrix(int[][] arr) {
        int n = arr.length, m = arr[0].length, tnel = n * m;
        int i = 0, j = 0, dir = 0;

        while (true) {
            dir = (dir + arr[i][j]) % 4;

            if (dir == 0) {
                j++;
                if (j == m) {
                    System.out.println(i + ", " + (j - 1));
                    break;
                }
            } else if (dir == 1) {
                i++;
                if (i == n) {
                    System.out.println((i + 1) + ", " + (j));
                    break;
                }
            } else if (dir == 2) {
                j--;
                if (j == -1) {
                    System.out.println(i + ", " + (j + 1));
                    break;
                }
            } else if (dir == 3) {
                i--;
                if (i == -1) {
                    System.out.println((i + 1) + ", " + (j));
                    break;
                }
            }
        }
        System.out.println(i + ", " + j);
    }

    public static void luckyNumber(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {

            int minCol = 0;

            for (int j = 1; j < cols; j++) {
                if (arr[i][j] < arr[i][minCol]) {
                    minCol = j;
                }
            }

            boolean isLucky = true;

            for (int k = 0; k < rows; k++) {
                if (arr[k][minCol] > arr[i][minCol]) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                System.out.println(arr[i][minCol]);
            }
        }
    }

    public static int diagonalDiff(int[][] arr) {
        int n = arr.length;
        int m = 0, k = 0;

        for (int i = 0; i < n; i++) {
            m += arr[i][i];
            k += arr[i][n - i - 1];
        }
        return (m - k);
    }

    public static void halfUpperDiagonal(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int gap = 0; gap < m; gap++) {
            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
    }
}
