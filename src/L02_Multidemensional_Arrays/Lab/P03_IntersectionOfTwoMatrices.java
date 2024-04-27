package L02_Multidemensional_Arrays.Lab;

import java.util.Scanner;

public class P03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        char[][] firstMatrix = readMatrix(sc, rows, cols);
        char[][] secondMatrix = readMatrix(sc, rows, cols);

        char[][] finalMatrix = new char[rows][cols];

        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col])
                    finalMatrix[row][col] = '*';

                else
                    finalMatrix[row][col] = firstMatrix[row][col];
            }
        }

        printMatrix(finalMatrix);
    }

    private static char[] readArray(Scanner scanner){
        return scanner.nextLine().replace(" ", "").toCharArray();
    }

    private static char[][] readMatrix(Scanner scanner, int rows, int cols){
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            char[] arr = readArray(scanner);

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }

    private static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
