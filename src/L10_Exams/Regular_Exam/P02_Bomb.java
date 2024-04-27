package L10_Exams.Regular_Exam;

import java.util.Scanner;

public class P02_Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        String[] directions = sc.nextLine().split(",");

        char[][] matrix = readMatrix(sc, size);

        int[] initialPosition = getMyInitialPosition(matrix);

        int myRow = initialPosition[0];
        int myCol = initialPosition[1];

        int bombs = getBombsCount(matrix);

        int deactivatedBombs = 0;

        boolean allBombsAreDeactivated = false;
        boolean exitIsReached = false;

        for (String direction : directions) {
            switch (direction) {
                case "up":
                    myRow--;
                    break;
                case "down":
                    myRow++;
                    break;
                case "left":
                    myCol--;
                    break;
                case "right":
                    myCol++;
                    break;
            }

            try {
                if (matrix[myRow][myCol] == 'B') {
                    deactivatedBombs++;
                    System.out.println("You found a bomb!");

                    if (deactivatedBombs == bombs) {
                        System.out.println("Congratulations! You found all bombs!");
                        allBombsAreDeactivated = true;
                        break;
                    }
                } else if (matrix[myRow][myCol] == 'e') {
                    int leftBombs = bombs - deactivatedBombs;
                    System.out.printf("END! %d bombs left on the field%n", leftBombs);
                    exitIsReached = true;
                    break;
                }
            } catch (IndexOutOfBoundsException exception) {
                switch (direction) {
                    case "up":
                        myRow++;
                        break;
                    case "down":
                        myRow--;
                        break;
                    case "left":
                        myCol++;
                        break;
                    case "right":
                        myCol--;
                        break;
                }
            }
        }

        if (!exitIsReached && !allBombsAreDeactivated){
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",
                    bombs - deactivatedBombs, myRow, myCol);
        }

    }

    private static char[] readArr(Scanner sc) {
        return sc.nextLine().replace(" ", "").toCharArray();
    }

    private static char[][] readMatrix(Scanner sc, int size) {
        char[][] matrix = new char[size][size];

        for (int row = 0; row < size; row++) {
            char[] arr = readArr(sc);
            for (int col = 0; col < size; col++) {
                matrix[row][col] = arr[col];
            }
        }

        return matrix;
    }

    private static int[] getMyInitialPosition(char[][] matrix) {
        int myRow = 0;
        int myCol = 0;

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 's') {
                    myRow = row;
                    myCol = col;
                    isFound = true;
                    break;
                }
            }
            if (isFound)
                break;
        }

        return new int[]{myRow, myCol};
    }

    private static int getBombsCount(char[][] matrix) {

        int bombsCount = 0;
        for (char[] chars : matrix) {
            for (char c : chars) {
                if (c == 'B') {
                    bombsCount++;
                }
            }
        }

        return bombsCount;
    }
}
