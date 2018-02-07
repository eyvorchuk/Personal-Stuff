import java.util.*;
import java.io.*;

public class OddManOut {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cases = in.nextInt();
    for (int i = 1; i <= cases; i++) {
      TreeSet<Integer> guests = new TreeSet<Integer>();
      int num_guests = in.nextInt();
      for (int j = 1; j <= num_guests; j++) {
        Integer curr_guest = Integer.parseInt(in.next());
        if (!guests.contains(curr_guest)) {
          guests.add(curr_guest);
        } else {
          guests.remove(curr_guest);
        }
      }
      System.out.println("Case #" + i + ": " + guests.first());
    }
  }
}
