import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintDirectories {

    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
                .forEach(System.out::println);

        System.out.println("-----------");
        Files
                .list(Paths.get("."))
                .filter(file -> Files.isDirectory(file))
                .forEach(System.out::println);
    }
}
