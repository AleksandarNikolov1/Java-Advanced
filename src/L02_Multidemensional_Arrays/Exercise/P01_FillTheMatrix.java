package L02_Multidemensional_Arrays.Exercise;

import java.util.Scanner;

public class P01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = null;

        if (pattern.equals("A"))
            matrix = fillMatrixWithPatternA(size);


        else if (pattern.equals("B"))
            matrix = fillMatrixWithPatternB(size);


        if (matrix != null)
            printMatrix(matrix);

    }

    private static int[][] fillMatrixWithPatternA(int size) {

        int[][] matrix = new int[size][size];
        int num = 1;

        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = num++;
            }
        }
        return matrix;
    }

    private static int[][] fillMatrixWithPatternB(int size) {

        int[][] matrix = new int[size][size];
        int num = 1;

        for (int col = 0; col < size; col++) {

            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = num++;
                }
            }

            else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
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

