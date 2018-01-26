public class Loop {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= 5 - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 1; j <= i; j++) {
		        System.out.print(i);
		    }
		    System.out.println();
		}
		int x = 6;
		int y = 7;
		System.out.println("x < y" + (x > y));
	}
}