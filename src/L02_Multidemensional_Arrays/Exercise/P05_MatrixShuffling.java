package L02_Multidemensional_Arrays.Exercise;

import java.util.Scanner;

public class P05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rowsAndCols = readArray(sc);
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        String[][] matrix = readMatrix(sc, rows, cols);

        String input = sc.nextLine();

        while (!input.equals("END")){

            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("swap") && tokens.length == 5) {

                try {

                    int row1 = Integer.parseInt(tokens[1]);
                    int col1 = Integer.parseInt(tokens[2]);
                    int row2 = Integer.parseInt(tokens[3]);
                    int col2 = Integer.parseInt(tokens[4]);

                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;

                    printMatrix(matrix);
                }

                catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            }

            else
                System.out.println("Invalid input!");

            input = sc.nextLine();
        }


    }

    private static String[] readArray(Scanner scanner){
        return scanner.nextLine().split("\\s+");
    }

    private static String[][] readMatrix(Scanner scanner, int rows, int cols){
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] arr = readArray(scanner);

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
