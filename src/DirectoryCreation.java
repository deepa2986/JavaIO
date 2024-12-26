import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryCreation {

    public static void main(String[] args) throws IOException {
        if (Files.notExists(Paths.get("src/directory"))) {
            Files.createDirectory(Paths.get("src/directory"));
        }
    }
}
