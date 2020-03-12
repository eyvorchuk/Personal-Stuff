import java.lang.Math;

public class TestRandom {
  public static void main(String[] args) {
    int w;
    int d1;
    int d2;
    int d3;
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      w = 1;
      d1 = (int) (6 * Math.random()) + 1;
      if (d1 >= 4) {
        w *= 2;
      }
      d2 = (int) (6 * Math.random()) + 1;
      d3 = (int) (6 * Math.random()) + 1;
      if (d1 + d2 + d3 < 12) {
        w *= -1;
      }
      sum += w;
      System.out.println(w);
    }
    System.out.println(sum);
  }
}
