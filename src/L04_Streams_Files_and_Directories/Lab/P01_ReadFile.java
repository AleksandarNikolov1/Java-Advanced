package L04_Streams_Files_and_Directories.Lab;

import java.io.*;


public class P01_ReadFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt";

        try {
            FileInputStream fis = new FileInputStream(filePath);

            int nextByte = fis.read();

            while (nextByte != -1){

                System.out.print(Integer.toBinaryString(nextByte) + " ");

                nextByte = fis.read();
            }

            fis.close();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }



    }
}
