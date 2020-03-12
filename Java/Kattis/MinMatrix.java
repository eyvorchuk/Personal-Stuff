import java.util.Arrays;

public class MinMatrix {
  public static void main(String[] args) {
    int[][] A = new int[][]{{1,-3,7},{10000,5,10000},{8,2,-5}};
    int[][] B = new int[][]{{8,10000,-4},{-3,0,-7},{5,-2,1}};
    int[][] C = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int minimum = A[i][0] + B[0][j];
        for (int k = 1; k < 3; k++) {
          if (A[i][k] + B[k][j] < minimum) {
            minimum = A[i][k] + B[k][j];
          }
        }
        C[i][j] = minimum;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(C[i][j] + " ");
      }
      System.out.println();
    }
  }
}
