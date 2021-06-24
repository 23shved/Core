package ua.lviv.shved.polidrom;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase();

		if (word.length() > 5) {
			System.out.println("Ваше слово: " + word + " занадто довге");
		} else if ((word.charAt(0) == word.charAt(word.length() - 1))
				&& (word.charAt(1) == word.charAt(word.length() - 2))) {

			System.out.println("Ваше слово: " + word + " є полідромом");
		} else {
			System.out.println("Ваше слово: " + word + " не є полідромом");
		}
		System.out.println(word.length());
	}

}
