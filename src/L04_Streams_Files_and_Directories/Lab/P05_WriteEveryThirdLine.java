package L04_Streams_Files_and_Directories.Lab;

import java.io.*;
import java.util.List;

public class P05_WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt";
        String outputFilePath = "C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\05.WriteEveryThirdLineOutput.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            PrintWriter writer = new PrintWriter(outputFilePath);

            List<String> lines = reader.lines().toList();

            for (int i = 2; i < lines.size(); i += 3) {
                writer.write(lines.get(i));
                writer.write(System.lineSeparator());
            }

            writer.close();
            reader.close();
        }

        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
