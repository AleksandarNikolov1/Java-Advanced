package L04_Streams_Files_and_Directories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P02_WriteToFile {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt";
        String outputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\02.WriteToFileOutput.txt";

        Set<Character> punctuationalMarks = Set.of(',', '.', '!', '?');
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)){

             int nextByte = fis.read();

             while (nextByte >= 0){
                 char symbol = (char) nextByte;

                 if (!punctuationalMarks.contains(symbol)){
                     fos.write(symbol);
                 }

                 nextByte = fis.read();
             }
        }

        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
