import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));
            System.out.println("First line : ");
            String firstLine = reader.readLine();
            System.out.println(firstLine);
            System.out.println("Every other line : ");
            StringBuilder builder = new StringBuilder();
            reader.lines().forEach(builder::append);
            System.out.println(builder);
    }
}
