import java.util.Scanner;
import java.math.BigInteger;

public class Sierpinski {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = 0;
    while (in.hasNextInt()) {
      cases++;
      int iterations = in.nextInt();
      BigInteger numerator = BigInteger.valueOf(3);
      numerator = numerator.pow(iterations+1);
      BigInteger denominator = BigInteger.valueOf(2);
      denominator = denominator.pow(iterations);
      BigInteger circumference = numerator.divide(denominator);
      System.out.println("Case " + cases + ": " + circumference.toString().length());
    }
  }
}
