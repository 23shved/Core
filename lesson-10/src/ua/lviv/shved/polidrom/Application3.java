package ua.lviv.shved.polidrom;

import java.util.Arrays;
import java.util.Scanner;

public class Application3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = new String(sc.nextLine());
		int l = 0;
		String[] results = word.split(" ");
		for (String result : results) {
			if (result.length() > 2) {
				l++;
			}
		}
		System.out.println("Your sentence has: " + l + " words;");
	}
}
