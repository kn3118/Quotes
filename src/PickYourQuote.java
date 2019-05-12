import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PickYourQuote {

  public static void main(String[] args) throws Exception{

    String quotesFile = args[0];
    FileReader file = new FileReader(quotesFile);
    BufferedReader bufferReader = new BufferedReader(file);
    int numberLines = parseInt(args[1]);
//    for (int i = 0; i < numberLines; i++) {
//      reformat(bufferReader, i);
//    }
    reformat(bufferReader, numberLines);

    bufferReader.close();

  }

  private static void reformat(BufferedReader bufferReader, int numberLines) throws IOException {
    String line = bufferReader.readLine();
    for (int i = 1; i < numberLines; i++) {
      line = bufferReader.readLine();
    }
    if (line == null) {
      return;
    }
    String[] parts = line.split(";");
      for (String str : parts) {
        System.out.println(str);
      }
  }

}
