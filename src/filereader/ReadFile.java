package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    // This method should return the first line of BufferedReaderVsScanner.txt.
        String getFirstLine() throws IOException {
            String firstLine = "";
            try(BufferedReader reader = new BufferedReader(new FileReader("src/filereader/filereader.txt"));) {
               firstLine = reader.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return firstLine;
        }

        // This method should return all of the content of BufferedReaderVsScanner.txt
        // as a single String.
        String getWholeFile() throws FileNotFoundException {
            String wholeFile = "";

           try(BufferedReader reader = new BufferedReader(new FileReader("src/filereader/filereader.txt"));){
               StringBuilder builder = new StringBuilder();
               reader.lines().forEach(line -> builder.append(line + " "));
               wholeFile = builder.toString();
           }
           catch (IOException e){
               e.printStackTrace();
           }
            return wholeFile;
        }


}
