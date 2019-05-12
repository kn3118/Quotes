import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QuotesPrinter {

  static final String quotesFile = "./Quotes.txt";

  public static void main(String[] args) throws Exception {

    // read the file Quotes.txt using a BufferedReader
    // reformat the file
    FileReader file = new FileReader(quotesFile);
    BufferedReader bufferReader = new BufferedReader(file);
    reformat(bufferReader);

    bufferReader.close();

  }

  public static void reformat(BufferedReader input) throws IOException {

    // read lines from the input
    // reformat as appropriate
    // print to System.out
    String line = input.readLine();
    while (line != null) {
      String[] parts = line.split(";");
      for (String str : parts) {
        System.out.println(str);
      }
      line = input.readLine();
    }

  }
}
