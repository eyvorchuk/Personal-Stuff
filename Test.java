public class Test {
	public static void main(String[] args) {
		int number = getInt(1);
		System.out.println(number);
		number = getInt(-1);
		System.out.println(number);
		number = getInt(7);
		System.out.println(number);
		number = getInt(18);
		System.out.println(number);
		number = getInt(43);
		System.out.println(number);
	}
	
	public static int getInt(int x) {
	    int a = 1;
	    int c = 0;
	    while (x > 0) {
	        a = x % 2;
	        if (a == 1) {
	            c++;
	        }
	        x /= 2;
	    }
	    return c;
	}
}