import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PickManyQuotes {

  public static void main(String[] args) throws Exception {

    // Use file name and quote numbers in args
    // to first create a list of quotes using loadQuotes
    // and then print to System.out the chosen quotes.

    String fileName = args[0];
    FileReader file = new FileReader(fileName);
    BufferedReader buffer = new BufferedReader(file);
    int count = args.length - 1;
    int[] choices = new int[count];
    for (int i = 0; i < count; i++) {
      choices[i] = parseInt(args[i + 1]);
    }
    List<Quote> list = loadQuotes(buffer);
    reformat(list, choices);

    buffer.close();
 }

  public static void reformat(List<Quote> quotes, int[] choices) {

    // Print to System.out quotes according to choices.
    int i = 0;
    while (i < choices.length) {
      Quote quote = quotes.get(choices[i] - 1);
      System.out.println(quote.toString());
      i++;
    }
  }

  public static List<Quote> loadQuotes(BufferedReader in) throws IOException {

    List<Quote> quotes = new ArrayList<Quote>();

    // Read lines from the input
    // Create a Quote object for each line and store in list.
    String line = in.readLine();
    while (line != null) {
      Quote quote = new Quote(line);
      quotes.add(quote);
      line = in.readLine();
    }

    return quotes;
  }

}

