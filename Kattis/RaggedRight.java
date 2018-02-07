import java.util.*;
import java.io.*;

public class RaggedRight {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] lines = new String[100];
    int line_count = 0;
    int max_length = 0;
    while(in.hasNext()) {
      lines[line_count] = in.nextLine();
      if (lines[line_count].length() > max_length) {
        max_length = lines[line_count].length();
      }
      line_count++;
    }
    int ragged = 0;
    for (int i = 0; i < line_count; i++) {
      if(lines[i].length() < max_length && i != line_count - 1) {
        ragged += (int) Math.pow(lines[i].length()-max_length,2);
      }
    }
    System.out.println(ragged);
  }
}
