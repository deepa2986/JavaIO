import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreation {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/newFile.txt");
        Files.createFile(path);
    }
}
