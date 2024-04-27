package L02_Multidemensional_Arrays.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rotation = sc.nextLine();

        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(rotation);

       // int degrees = Integer.parseInt(matcher.group());

        String input = sc.nextLine();

        List<String> inputs = new ArrayList<>();

        while (!input.equals("END")){
            inputs.add(input);

            input = sc.nextLine();
        }

        int maxLength = 0;

        for (String s : inputs) {
            if (s.length() > maxLength)
                maxLength = s.length();
        }

        char[][] matrix = new char[inputs.size()][];

        int index = 0;

        for (String s : inputs) {
            if (s.length() < maxLength){
                s = s + " ".repeat(maxLength - s.length());
            }
            char[] arr = s.toCharArray();
            matrix[index++] = arr;
        }


           char[][] resultMatrix = rotateMatrix(matrix, maxLength, 90);

        printMatrix(resultMatrix);

    }

    private static char[][] rotateMatrix(char[][] matrix, int maxLength, int degrees)  {

        char[][] resultMatrix = null;


        if (degrees % 90 == 0){

            resultMatrix = new char[maxLength][];

            int c = 0;
            int r = matrix.length - 1;

            for (int col = 0; col < matrix.length; col++) {
                for (int row = 0; row < resultMatrix.length; row++) {
                    resultMatrix[row][col] = matrix[r][c++];
                }
            }
        }

        else if (degrees % 180 == 0){
            resultMatrix = new char[matrix.length][];

            int c = maxLength - 1;
            int r = matrix.length - 1;

            for (int row = 0; row < resultMatrix.length; row++) {
                for (int col = 0; col < resultMatrix[row].length; col++) {
                    resultMatrix[row][col] = matrix[r][c--];
                }

                r--;
            }
        }

        return resultMatrix;
    }


    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
