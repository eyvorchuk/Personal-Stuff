import java.util.*;
import java.io.*;

public class Bishops {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNextInt()) {
      int size = in.nextInt();
      int max = size;
      if (size > 2) {
        max += size - 2;
      }
      System.out.println(max);
    }
  }
}
