import java.util.*;
import java.io.*;

public class ScalarProduct {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    for (int i = 1; i <= cases; i++) {
      int components = in.nextInt();
      int[] v1 = new int[components];
      int[] v2 = new int[components];
      for (int j = 0; j < components; j++) {
        v1[j] = in.nextInt();
      }
      for (int j = 0; j < components; j++) {
        v2[j] = in.nextInt();
      }
      int product = 0;
      Arrays.sort(v1);
      Arrays.sort(v2);
      int[] reverseV2 = new int[components];
      for (int j = 0; j < components; j++) {
        reverseV2[j] = v2[components - j - 1];
        product += v1[j] * reverseV2[j];
      }
      System.out.println("Case #" + i + ": " + product);
    }
  }
}
