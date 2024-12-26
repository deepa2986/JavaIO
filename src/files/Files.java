package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Files {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("First line : ");
        String firstLine = reader.readLine();
        System.out.println(firstLine);
        System.out.println("Every other line : ");
        StringBuilder builder = new StringBuilder();
        reader.lines().forEach(builder::append);
        System.out.println(builder);
    }
}
