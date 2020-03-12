import java.util.Scanner;

public class CharacterDevelopment {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int characters = in.nextInt();
    if (characters == 1) {
      System.out.println(0);
    } else {
      long[][] coeffs = new long[characters + 1][characters + 1];
      for (int i = 0; i <= characters; i++) {
        coeffs[i][0] = 1;
        coeffs[i][i] = 1;
      }
      for (int i = 1; i <= characters; i++) {
        for (int j = 1; j <= characters; j++) {
          coeffs[i][j] = coeffs[i - 1][j - 1] + coeffs[i - 1][j];
        }
      }
      long total = 0;
      for (int i = 2; i <= characters; i++) {
        total += coeffs[characters][i];
      }
      System.out.println(total);
    }
  }
}
