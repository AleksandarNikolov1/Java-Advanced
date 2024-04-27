package L04_Streams_Files_and_Directories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P03_CopyBytes {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt";
        String outputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\03.CopyBytesOutput.txt";


        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)){

            int nextByte = fis.read();

            while (nextByte >= 0){

                String digits = String.valueOf(nextByte);

                for (int i = 0; i < digits.length(); i++) {
                    fos.write(digits.charAt(i));
                }

                nextByte = fis.read();
            }
        }

        catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
