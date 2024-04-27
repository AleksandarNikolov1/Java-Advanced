package L02_Multidemensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04_MaximalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int[][] matrix = readMatrix(sc, rows, cols);


        int[][] maxMatrix = new int[3][3];
        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                int sum = 0;


                for (int r = row; r < row + 3; r++) {
                    for (int c = col; c < col + 3; c++) {

                        try {
                            sum += matrix[r][c];
                        }

                        catch (IndexOutOfBoundsException ignored){}

                    }
                }

                if (sum > maxSum){
                    maxSum = sum;
                    startRow = row;
                    startCol = col;
                }

            }
        }

        int r = 0;
        int c = 0;


        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                maxMatrix[r][c++] = matrix[row][col];
            }
            c = 0;
            r++;
        }

        System.out.println("Sum = " + maxSum);
        printMatrix(maxMatrix);
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

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
