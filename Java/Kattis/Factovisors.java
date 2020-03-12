import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Factovisors {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		    BigInteger num1 = BigInteger.valueOf((long)in.nextInt());
		    BigInteger factorial = num1;
		    BigInteger num2 = BigInteger.valueOf((long)in.nextInt());
		    BigInteger i = new BigInteger("0");
		    BigInteger zero = i;
		    BigInteger one = new BigInteger("1");
		    BigInteger two = new BigInteger("2");
		    for (i = num1.subtract(one); i.compareTo(two) == 0 || i.compareTo(two) == 1; i.subtract(one)) {
		        factorial = factorial.multiply(i);
		        if (factorial.mod(num2).compareTo(zero) == 0) {
		            System.out.println(num2.toString() + " divides " + num1.toString() + "!");
		            break;
		        }
		    }
		    if (i.compareTo(one) == 1) {
		        System.out.println(num2.toString() + " does not divide " + num1.toString() + "!");
		    }
		}
	}
}