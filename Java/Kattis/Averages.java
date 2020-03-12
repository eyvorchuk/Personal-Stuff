import java.util.*;
import java.io.*;

public class Averages {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    for (int i = 1; i <= cases; i++) {
      int num_comp_students = in.nextInt();
      int num_econ_students = in.nextInt();
      int[] comp_students = new int[num_comp_students];
      int[] econ_students = new int[num_econ_students];
      for (int j = 0; j < num_comp_students; j++) {
        comp_students[j] = in.nextInt();
      }
      for (int j = 0; j < num_econ_students; j++) {
        econ_students[j] = in.nextInt();
      }
      int sum = 0;
      for (int j = 0; j < num_comp_students; j++) {
        sum += comp_students[j];
      }
      double comp_average = 1.0 * sum / num_comp_students;
      sum = 0;
      for (int j = 0; j < num_econ_students; j++) {
        sum += econ_students[j];
      }
      double econ_average = 1.0 * sum / num_econ_students;
      int count = 0;
      for (int j = 0; j < num_comp_students; j++) {
        if (comp_students[j] < comp_average && comp_students[j] > econ_average) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
