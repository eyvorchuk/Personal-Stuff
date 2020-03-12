import java.util.Scanner;

public class UnionFind {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    WeightedQuickUnionUF unionize = new WeightedQuickUnionUF(in.nextInt());
    int operations = in.nextInt();
    for (int i = 1; i <= operations; i++) {
      char op = in.next().charAt(0);
      if (op == '?') {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (unionize.connected(num1,num2)) {
          System.out.println("yes");
        } else {
          System.out.println("no");
        }
      } else {
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        unionize.union(num1,num2);
      }
    }
  }
}
