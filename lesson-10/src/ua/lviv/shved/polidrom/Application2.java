package ua.lviv.shved.polidrom;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder word = new StringBuilder(sc.nextLine());
		String newWord = "";
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {
				word.deleteCharAt(i);
				word.insert(i, '-');
			}

		}
		System.out.println(word);

	}

}
