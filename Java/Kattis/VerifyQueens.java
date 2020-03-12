import java.util.Scanner;
import java.lang.Math;

public class VerifyQueens {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int queens = in.nextInt();
    int [] rows = new int[queens];
    int [] cols = new int[queens];
    int count = 0;
    while (in.hasNextInt()) {
      rows[count] = in.nextInt();
      cols[count] = in.nextInt();
      count++;
    }
    for (int i = 0; i < queens; i++) {
      for (int j = i + 1; j < queens; j++) {
        if (rows[i] - rows[j] == 0 || cols[i] - cols[j] == 0 || Math.abs(rows[i] - rows[j]) == Math.abs(cols[i] - cols[j])) {
          System.out.println("INCORRECT");
          return;
        }
      }
    }
    System.out.println("CORRECT");
  }
}
