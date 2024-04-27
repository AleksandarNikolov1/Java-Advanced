package L02_Multidemensional_Arrays.Lab;

import java.util.*;

public class P08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = new int[n][];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        int[] wrongValueIndexes = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int wrongValueIndexRow = wrongValueIndexes[0];
        int wrongValueIndexCol = wrongValueIndexes[1];

        int wrongValue = matrix[wrongValueIndexRow][wrongValueIndexCol];

        List<int[]> fixedValues = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    fixedValues.add(replaceValue(matrix, row, col, wrongValue));
                }
            }
        }

        for (int[] fixedValue : fixedValues) {
            int row = fixedValue[0];
            int col = fixedValue[1];
            int value = fixedValue[2];

            matrix[row][col] = value;
        }

        printMatrix(matrix);
    }

    private static int[] replaceValue(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;

        try {
            boolean isValid = matrix[row - 1][col] != wrongValue ;
            if (isValid)
                sum += matrix[row - 1][col];
        }

        catch (IndexOutOfBoundsException ignored){}

        try {
            boolean isValid = matrix[row][col + 1] != wrongValue ;
            if (isValid)
                sum += matrix[row][col + 1];
        }

        catch (IndexOutOfBoundsException ignored){}

        try {
            boolean isValid = matrix[row + 1][col] != wrongValue ;
            if (isValid)
                sum += matrix[row + 1][col];
        }

        catch (IndexOutOfBoundsException ignored){}

        try {
            boolean isValid = matrix[row][col - 1] != wrongValue;
            if (isValid)
                sum += matrix[row][col - 1];
        }

        catch (IndexOutOfBoundsException ignored){}

        return new int[]{row, col, sum};
    }

    private static void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
