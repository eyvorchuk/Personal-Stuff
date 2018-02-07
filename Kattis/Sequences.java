import java.util.*;
import java.io.*;

public class Sequences {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sequences = in.nextInt();
    for (int i = 1; i <= sequences; i++) {
      int numbers = in.nextInt();
      int[] num_list = new int[numbers];
      for (int j = 0; j < numbers; j++) {
        num_list[j] = in.nextInt();
      }
      int j;
      int diff = num_list[1] - num_list[0];
      for (j = 1; j < numbers - 1; j++) {
        if (num_list[j + 1] - num_list[j] != diff) {
          break;
        }
      }
      if (j == numbers - 1) {
        System.out.println("arithmetic");
      } else {
        Arrays.sort(num_list);
        int new_diff = num_list[1] - num_list[0];
        int k;
        for (k = 1; k < numbers - 1; k++) {
          if(num_list[k + 1] - num_list[k] != new_diff) {
            System.out.println("non-arithmetic");
            break;
          }
        }
        if (k == numbers - 1) {
          System.out.println("permuted arithmetic");
        }
      }
    }
  }
}
