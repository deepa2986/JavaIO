import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopier {

    public static void main(String[] args) throws IOException {

        if(Files.notExists(Paths.get("src/files/b"))) {
            Files.createDirectory(Paths.get("src/files/b"));
        }

        Path pathToFile = Paths.get("src/files/a/example.txt");
        Path pathToNewLocation = Paths.get("src/files/b/example.txt");

        if(Files.notExists(pathToNewLocation)) {
            Files.copy(pathToFile, pathToNewLocation);
        }
    }
}
