package L02_Multidemensional_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int cols = rows;

        int[][] matrix = readMatrix(sc, rows, cols);

        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row++][col++] + " ");
        }

        System.out.println();

        row = rows - 1;
        col = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[row--][col++] + " ");
        }
    }

    private static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split(" "))
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
