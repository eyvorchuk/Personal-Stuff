import java.util.*;

public class WordNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please type a sentence. ");
		String sentence = input.nextLine();
		if (sentence.length() == 0) {
			System.out.println("No words.");
		} else {
			int words = findWords(sentence);
			System.out.println("Words: " + words);
		}
	}
	
	public static int findWords(String sentence) {
		int wordCount = 1;
		for (int index = 0; index < sentence.length(); index++) {
			if (sentence.charAt(index) == ' ') {
				wordCount++;
			}
		}
		return wordCount;
	}
}