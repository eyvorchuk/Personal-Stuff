// V00864667 Yvorchuk, Eric

import java.io.*;
import java.util.*;

public class Zamka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int d = in.nextInt();
        int x = in.nextInt();
        int n = 0;
        int m = 0;
        for (int i = l; i <= d; i++) {
            if (sumDigits(i) == x) {
                if (n == 0) {
                    n = i;
                    m = i;
                } else {
                    m = i;
                }
            }
        }
        System.out.println(n);
        System.out.println(m);
    }
    
    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}