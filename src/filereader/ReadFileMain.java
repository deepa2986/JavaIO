package filereader;

import java.io.IOException;

public class ReadFileMain {

    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile();
        String firstLine = file.getFirstLine();
        System.out.println(firstLine);

        String wholeFile = file.getWholeFile();
        System.out.println(wholeFile);
    }
}
