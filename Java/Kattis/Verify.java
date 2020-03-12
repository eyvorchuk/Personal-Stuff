import java.util.Scanner;

public class Verify {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[][] board = new int[size][size];
    if (!initializeBoard(board,in)) {
      System.out.println("INCORRECT");
      return;
    }
    if (!checkDiagonals(board)) {
      System.out.println("INCORRECT");
      return;
    }
    System.out.println("CORRECT");
  }

  public static boolean initializeBoard(int[][] board, Scanner input) {
    int [] seen_row = new int[board.length];
    int [] seen_col = new int[board.length];
    int count = 0;
    while(input.hasNextInt()) {
      int dim_1 = input.nextInt();
      int dim_2 = input.nextInt();
      for (int i = 0; i < count; i++) {
        if (dim_1 == seen_row[i] || dim_2 == seen_col[i]) {
          return false;
        }
      }
      seen_row[count] = dim_1;
      seen_col[count] = dim_2;
      count++;
      board[dim_1][dim_2] = 1;
    }
    return true;
  }

  public static boolean checkDiagonals(int[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[i][j] == 1) {
          int row = i;
          int col = j;
          while (row + 1 < board.length && col - 1 >= 0) {
            row += 1;
            col -= 1;
            if (board[row][col] == 1) {
              return false;
            }
          }
          row = i;
          col = j;
          while (row + 1 < board.length && col + 1 < board.length) {
            row += 1;
            col += 1;
            if (board[row][col] == 1) {
              return false;
            }
          }
          row = i;
          col = j;
          while (row - 1 >= 0 && col - 1 >= 0) {
            row -= 1;
            col -= 1;
            if (board[row][col] == 1) {
              return false;
            }
          }
          row = i;
          col = j;
          while (row - 1 >= 0 && col + 1 < board.length) {
            row -= 1;
            col += 1;
            if (board[row][col] == 1) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
