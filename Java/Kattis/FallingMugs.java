import java.util.*;
import java.io.*;

public class FallingMugs {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int d = in.nextInt();
    	for (int i = 0; i <= 0; i++) {
    	    for (int j = i + 1; j <= (int) Math.sqrt(200000); j++) {
    	        if (j*j - i*i == d) {
    	            System.out.println(i + " " + j);
    	            return;
    	        } else if (j*j - i*i > d) {
    	            break;
    	        }
    	    }
    	}
    	System.out.println("impossible");
    }
}