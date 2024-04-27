package L02_Multidemensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        String[][] matrix = new String[rows][cols];

        char c = 'a';
        char middle = 'a';

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.valueOf(sb.append(c).append(middle++).append(c));
                sb.setLength(0);
            }
            c++;
            middle = c;
        }

        printMatrix(matrix);
    }

    private static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
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
