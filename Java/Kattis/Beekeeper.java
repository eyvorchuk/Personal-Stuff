import java.util.Scanner;

public class Beekeeper {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int words = in.nextInt();
    while (words != 0) {
      int max_pairs = 0;
      String best_word = null;
      for (int i = 1; i <= words; i++) {
        String curr_word = in.next();
        int curr_pairs = 0;
        for (int j = 0; j < curr_word.length() - 1; j++) {
          if (curr_word.charAt(j) == curr_word.charAt(j + 1)) {
            if (curr_word.charAt(j) == 'a' || curr_word.charAt(j) == 'e' || curr_word.charAt(j) == 'i' || curr_word.charAt(j) == 'o' || curr_word.charAt(j) == 'u' || curr_word.charAt(j) == 'y') {
              curr_pairs++;
            }
          }
        }
        if (curr_pairs >= max_pairs) {
          max_pairs = curr_pairs;
          best_word = curr_word;
        }
      }
      System.out.println(best_word);
      words = in.nextInt();
    }
  }
}
