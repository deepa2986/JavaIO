import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExercise {

    public static void main(String[] args) throws IOException {

        if(Files.notExists(Paths.get("src/folderA"))) {
            Files.createDirectory(Paths.get("src/folderA"));
        }

        Path path = Paths.get("src/folderA/a.txt");
        if(Files.notExists(path)) {
            Files.createFile(path);
        }

        if(Files.notExists(Paths.get("src/folderB"))) {
            Files.createDirectory(Paths.get("src/folderB"));
        }

        Path newPath = Paths.get("src/folderB/a.txt");
        if(Files.notExists(newPath)) {
            Files.copy(path, newPath);
        }

        Files.list(Paths.get("src")).forEach(System.out::println);
    }
}
