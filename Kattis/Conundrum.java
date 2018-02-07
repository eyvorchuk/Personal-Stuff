import java.util.Scanner;

public class Conundrum {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = in.next();
    int times = 0;
    for (int i = 0; i < text.length(); i++) {
      if ((i % 3 == 0 && text.charAt(i) != 'P') || (i % 3 == 1 && text.charAt(i) != 'E') || (i % 3 == 2 && text.charAt(i) != 'R')) {
        times++;
      }
    }
    System.out.println(times);
  }
}
