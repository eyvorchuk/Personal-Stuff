import java.util.*;

public class EraseSecurely {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int switchTimes = in.nextInt();
    String first = in.next();
    String second = in.next();
    if (switchTimes % 2 == 0) {
      if (first.equals(second)) {
        System.out.println("Deletion succeeded");
      } else {
        System.out.println("Deletion failed");
      }
    } else {
        for (int i = 0; i < first.length(); i++) {
          char first_char = first.charAt(i);
          char second_char = second.charAt(i);
          if (first_char == second_char) {
            System.out.println("Deletion failed");
            return;
          }
        }
        System.out.println("Deletion succeeded");
    }
  }
}
