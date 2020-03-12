public class Mystery {
	public static void main(String[] args) {
		int mysteryInt = 1;
		int counter = 1;
		while (mysteryInt < 7) {
			mysteryInt *= counter;
			counter++;
		}
		System.out.println(mysteryInt);
		System.out.println(counter);
	}
}