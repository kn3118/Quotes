public class Quote {

  private String quote;
  private String additionalData;

  public Quote(String str) {
    String[] string = str.split(";");
    quote = string[0];
    if (string.length > 1) {
      additionalData = string[1];
    } else {
      additionalData = "";
    }
  }

  @Override
  public String toString() {
    return "'" + quote + "'" + " by " + additionalData;
  }

}
