import java.util.*;
import java.io.*;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] group = new int[size];
        int[] freq = new int[6];
        int unique = 0;
        for (int i = 0; i < size; i++) {
            int roll = in.nextInt();
            freq[roll - 1]++;
            group[i] = roll;
        }
        for (int i = 5; i >= 0; i--) {
            if(freq[i] == 1) {
                unique = i + 1;
                break;
            }
        }
        if (unique != 0) {
            for (int i = 0; i < size; i++) {
                if (group[i] == unique) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            System.out.println("none");
        }
    }
}
            