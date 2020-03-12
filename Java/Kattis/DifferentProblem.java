import java.io.*;
import java.util.*;

public class DifferentProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLong()) {
		    long n1 = in.nextLong();
		    long n2 = in.nextLong();
		    System.out.println(Math.abs(n1 - n2));
		}
	}
}