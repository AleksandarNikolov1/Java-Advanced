package L09_Exam_Preparation;

import java.util.Scanner;

public class Selling_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        char[][] matrix = readMatrix(sc, n, n);

        int myRow = 0;
        int myCol = 0;

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'S') {
                    myRow = row;
                    myCol = col;
                    isFound = true;
                    break;
                }
            }
            if (isFound)
                break;
        }

        boolean isOutOfBakery = false;
        int amount = 0;

        while (true) {
            String direction = sc.nextLine();
            matrix[myRow][myCol] = '-';

            switch (direction) {
                case "right":
                    myCol++;
                    break;
                case "left":
                    myCol--;
                    break;
                case "up":
                    myRow--;
                    break;
                case "down":
                    myRow++;
                    break;
            }

            try {
                if (Character.isDigit(matrix[myRow][myCol])) {
                    amount += Integer.parseInt(String.valueOf(matrix[myRow][myCol]));
                    matrix[myRow][myCol] = 'S';
                }
                else if (matrix[myRow][myCol] == 'O'){
                    int[] newPosition = changePosition(matrix, myRow, myCol);
                    myRow = newPosition[0];
                    myCol = newPosition[1];
                }
                else {
                    matrix[myRow][myCol] = 'S';
                }
            }

            catch (IndexOutOfBoundsException e) {
                isOutOfBakery = true;
            }

            if (amount >= 50){
                System.out.printf("Good news! You succeeded in collecting enough money!%nMoney: %d%n", amount);
                printMatrix(matrix);
                break;
            }

            else if (isOutOfBakery)
                break;
        }

        if (isOutOfBakery){
            System.out.printf("Bad news, you are out of the bakery.%nMoney: %d%n", amount);
            printMatrix(matrix);
        }

    }

    private static char[] readArray(Scanner sc) {
        return sc.nextLine().toCharArray();
    }

    private static char[][] readMatrix(Scanner sc, int rows, int cols) {
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            char[] arr = readArray(sc);

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }

    private static int[] changePosition(char[][] matrix, int row, int col){
        int myRow = 0;
        int myCol = 0;
        boolean isFound = false;

        matrix[row][col] = '-';

        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[row].length; j++) {
                    if (matrix[i][j] == 'O') {
                        matrix[i][j] = 'S';
                        myRow = i;
                        myCol = j;
                        isFound = true;
                        break;
                    }
                }

            if (isFound)
                break;
        }
        return new int[]{myRow, myCol};
    }

    private static void printMatrix(char[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
