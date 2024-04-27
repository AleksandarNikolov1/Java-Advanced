package L02_Multidemensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(sc, rows, cols);

        int maxSum = Integer.MIN_VALUE;

        int[][] maxMatrix = new int[2][2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                try {
                    int f = matrix[row][col];
                    int s = matrix[row][col + 1];
                    int t = matrix[row + 1][col];
                    int fo = matrix[row + 1][col + 1];

                    int sum = f + s + t + fo;

                    if (sum > maxSum) {
                        maxSum = sum;

                        maxMatrix[0][0] = f;
                        maxMatrix[0][1] = s;
                        maxMatrix[1][0] = t;
                        maxMatrix[1][1] = fo;
                    }
                }

                catch (IndexOutOfBoundsException ignored){}
            }
        }

        printMatrix(maxMatrix);
        System.out.println(maxSum);
    }

    private static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int cols){
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = readArray(scanner);

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
