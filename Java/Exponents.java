import java.util.*;

public class Exponents {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		int base = input.nextInt();
		System.out.print("Max exponent: ");
		int maxExponent = input.nextInt();
		System.out.print(base);
		for (int i = 2; i <= maxExponent; i++) {
			System.out.print(", " + (int) Math.pow(base,i));
		}
		System.out.println();
	}
}		