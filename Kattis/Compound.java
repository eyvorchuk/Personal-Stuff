import java.util.*;
import java.io.*;

public class Compound {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    TreeSet<String> compWords = new TreeSet<String>();
    String[] words = new String[100000];
    int size = 0;
    while (in.hasNext()) {
      words[size] = in.next();
      size++;
    }
    for (int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        if (j != i) {
          compWords.add(words[i] + words[j]);
        }
      }
    }
    while(!compWords.isEmpty()) {
      System.out.println(compWords.pollFirst());
    }
  }
}
