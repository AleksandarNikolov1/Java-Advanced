package L02_Multidemensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = readMatrix(sc, n, n);

        int diagonalDifference = getDiagonalsSubtraction(matrix);

        System.out.println(diagonalDifference);
    }

    private static int getDiagonalsSubtraction(int[][] matrix){
        int firstDiagonalSum = 0;

        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            firstDiagonalSum += matrix[row++][col++];
        }

        int secondDiagonalSum = 0;

        row = matrix.length - 1;
        col = 0;

        for (int i = 0; i < matrix.length; i++) {
            secondDiagonalSum += matrix[row--][col++];
        }

        return Math.abs(firstDiagonalSum - secondDiagonalSum);
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
