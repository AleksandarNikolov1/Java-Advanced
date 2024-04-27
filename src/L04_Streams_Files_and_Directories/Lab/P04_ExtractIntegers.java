package L04_Streams_Files_and_Directories.Lab;

import java.io.*;
import java.util.Scanner;

public class P04_ExtractIntegers {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt";

        try {
            FileInputStream reader = new FileInputStream(inputFilePath);
            Scanner sc = new Scanner(reader);

            while (sc.hasNext()){
                if (sc.hasNextInt()){
                    int number = sc.nextInt();
                    System.out.println(number);
                }

                else
                    sc.next();
            }

        }

        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
