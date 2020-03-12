// V00864667 Yvorchuk, Eric

import java.util.*;
import java.io.*;
import java.text.*;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        for (int i = 1; i <= tests; i++) {
            int students = in.nextInt();
            int[] scores = new int[students];
            int sum = 0;
            for (int j = 1; j <= students; j++) {
                int score = in.nextInt();
                sum += score;
                scores[j - 1] = score;
            }
            int average = sum / students;
            int above = 0;
            for (int j = 0; j < students; j++) {
                if (scores[j] > average) {
                    above++;
                }
            }
            NumberFormat formatter = new DecimalFormat("#0.000");
            double percentAbove = 100.0 * above / students; 
            System.out.println(formatter.format(percentAbove) + "%");
        }
    }
}