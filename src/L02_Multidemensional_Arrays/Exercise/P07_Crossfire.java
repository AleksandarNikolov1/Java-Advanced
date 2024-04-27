package L02_Multidemensional_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] rowsAndCols = readArray(sc);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        Integer[][] matrix = new Integer[rows][cols];

        fillMatrix(matrix);

        String input = sc.nextLine();

        while (!input.equals("Nuke it from orbit")){
            String[]tokens = input.split("\\s+");

            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int rad = Integer.parseInt(tokens[2]);

            matrix[row][col] = 0;

            int r = row - 1;
            int c = col;

            try {

                for (int i = 0; i < rad; i++) {
                   if (matrix[r--][c] == 0) {
                       try {
                           matrix[r][c + 1] = 0;
                       } catch (IndexOutOfBoundsException ignored) {}
                   }
                   else
                       matrix[r][c] = 0;
                }
            }
            catch (IndexOutOfBoundsException ignored){}

                r = row;
                c = col + 1;

                try {
                    for (int i = 0; i < rad; i++) {
                        matrix[r][c++] = 0;
                    }
                }
                catch (IndexOutOfBoundsException ignored){}

                r = row + 1;
                c = col;

                try {
                    for (int i = 0; i < rad; i++) {
                        matrix[r++][c] = 0;
                    }
                }
                catch (IndexOutOfBoundsException ignored){}

                r = row;
                c = col - 1;

                try {
                    for (int i = 0; i < rad; i++) {
                        matrix[r][c--] = 0;
                    }
                }
                catch (IndexOutOfBoundsException ignored){}

            input = sc.nextLine();


        }

        printMatrix(matrix);
    }


    private static int[] readArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillMatrix(Integer[][] matrix){

        int num = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = num++;
            }
        }
    }

    private static void printMatrix(Integer[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] != 0)
                    System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
