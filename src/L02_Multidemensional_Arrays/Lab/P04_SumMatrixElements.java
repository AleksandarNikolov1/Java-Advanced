package L02_Multidemensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(sc, rows, cols);

        int sumOfElements = sumMatrixElements(matrix);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumOfElements);


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

    private static int sumMatrixElements(int[][] matrix){
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        return sum;
    }
}
