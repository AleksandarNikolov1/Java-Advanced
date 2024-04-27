package L04_Streams_Files_and_Directories.Lab;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class P07_ListFiles {
    public static void main(String[] args) {
        List<File> files = Arrays.asList(File.listRoots());
    }
}
