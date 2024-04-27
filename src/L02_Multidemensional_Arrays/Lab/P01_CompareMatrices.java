package L02_Multidemensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] firstMatrix = readMatrix(sc, rows, cols);

        rowsAndCols = readArray(sc);
        rows = rowsAndCols[0];
        cols = rowsAndCols[1];

        int[][] secondMatrix = readMatrix(sc, rows, cols);

        if (areEqual(firstMatrix, secondMatrix))
            System.out.println("equal");

        else
            System.out.println("not equal");
    }

    private static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
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

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix){
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }

        else {
            for (int row = 0; row < firstMatrix.length; row++) {
                if (Arrays.compare(firstMatrix[row], secondMatrix[row]) != 0)
                    return false;
            }
        }

        return true;
    }
}
