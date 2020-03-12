import java.util.*;
import java.io.*;

public class Towering {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int[] boxes = new int[6];
    for (int i = 0; i < 6; i++) {
      boxes[i] = in.nextInt();
    }
    int tower1 = in.nextInt();
    int tower2 = in.nextInt();
    int[] reversal = new int[6];
    for (int i = 0; i < boxes.length; i++) {
      for (int j = 0; j < i; j++) {
        for (int k = 0; k < j; k++) {
          if (boxes[i] + boxes[j] + boxes[k] == tower1) {
            int[] sort1 = new int [] {boxes[i],boxes[j],boxes[k]};
            Arrays.sort(sort1);
            for (int l = 3; l < 6; l++) {
              reversal[l] = sort1[l - 3];
            }
          } else if (boxes[i] + boxes[j] + boxes[k] == tower2) {
            int[] sort2 = new int [] {boxes[i],boxes[j],boxes[k]};
            Arrays.sort(sort2);
            for (int l = 0; l < 3; l++) {
              reversal[l] = sort2[l];
            }
          }
        }
      }
    }
    for (int i = 5; i >= 0; i--) {
      System.out.print(reversal[i] + " ");
    }
  }
}
