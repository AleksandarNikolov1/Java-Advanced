package L04_Streams_Files_and_Directories.Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P06_SortLines {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\input.txt");
        Path outputPath = Paths.get("C:\\Users\\Alex\\Desktop\\Java_Advanced\\src\\Streams_Files_and_Directories\\Lab\\06.SortLinesOutput.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);

            Files.write(outputPath, lines);
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
