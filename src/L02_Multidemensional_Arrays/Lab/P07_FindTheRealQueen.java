package L02_Multidemensional_Arrays.Lab;

import java.util.Scanner;

public class P07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matrix = readMatrix(sc, 8, 8);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'q') {

                    boolean isValid = true;

                    for (int c = col + 1; c < matrix[row].length; c++) {
                        if (matrix[row][c] == 'q') {
                            isValid = false;
                            break;
                        }
                    }

                    for (int r = row + 1; r < matrix.length; r++) {
                        if (matrix[r][col] == 'q') {
                            isValid = false;
                            break;
                        }
                    }

                    for (int r = row - 1; r >= 0 ; r--) {
                        if (matrix[r][col] == 'q'){
                            isValid = false;
                            break;
                        }
                    }

                    for (int c = col - 1; c >= 0 ; c--) {
                        if (matrix[row][c] == 'q'){
                            isValid = false;
                            break;
                        }
                    }

                    int tempRow = row + 1;
                    int tempCol = col + 1;

                    try {
                        for (int i = tempRow; i < matrix.length; i++) {

                            if (matrix[tempRow++][tempCol++] == 'q') {
                                isValid = false;
                                break;
                            }
                        }
                    } catch (IndexOutOfBoundsException ignored) {
                    }

                    tempRow = row + 1;
                    tempCol = col - 1;

                    try {
                        for (int i = tempRow; i < matrix.length; i++) {
                            if (matrix[tempRow++][tempCol--] == 'q') {
                                isValid = false;
                                break;
                            }
                        }
                    } catch (IndexOutOfBoundsException ignored) {
                    }


                    tempRow = row - 1;
                    tempCol = col - 1;

                    try {
                        for (int i = row; i < matrix.length; i++) {
                            if (matrix[tempRow--][tempCol--] == 'q') {
                                isValid = false;
                                break;
                            }
                        }
                    } catch (IndexOutOfBoundsException ignored) {
                    }


                    tempRow = row - 1;
                    tempCol = col + 1;

                    try {
                        for (int i = row; i < matrix.length; i++) {
                            if (matrix[tempRow--][tempCol++] == 'q') {
                                isValid = false;
                                break;
                            }
                        }
                    } catch (IndexOutOfBoundsException ignored) {
                    }

                    if (isValid) {
                        System.out.println(row + " " + col);
                    }
                }
                }
            }
    }


        private static char[] readArray (Scanner scanner){
            return scanner.nextLine().replace(" ", "").toCharArray();
        }

        private static char[][] readMatrix (Scanner scanner,int rows, int cols){
            char[][] matrix = new char[rows][cols];
            for (int row = 0; row < rows; row++) {
                char[] arr = readArray(scanner);

                for (int col = 0; col < cols; col++) {
                    matrix[row][col] = arr[col];
                }
            }

            return matrix;
        }
    }
