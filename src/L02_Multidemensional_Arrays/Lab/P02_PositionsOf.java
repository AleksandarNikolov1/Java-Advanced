package L02_Multidemensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(sc, rows, cols);

        int searchedNumber = Integer.parseInt(sc.nextLine());

        boolean existSearchedNumber = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchedNumber) {
                    System.out.println(row + " " + col);
                    existSearchedNumber = true;
                }
            }
        }

        if (!existSearchedNumber)
            System.out.println("not found");
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

}
