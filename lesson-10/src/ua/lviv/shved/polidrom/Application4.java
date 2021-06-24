package ua.lviv.shved.polidrom;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = new String(sc.nextLine());
		int counter = 0;
		int max = 0;
		String mostSeq = "";
		String[] results = word.split(" ");
		for (int k = 0; k <= results.length - 1; k++) {
			if (word.length() > 2) {
				for (int i = 0; i <= results.length - 1; i++) {
					if (results[k].equals(results[i])) {
						counter++;

					}
					if (counter > max) {
						max = counter;
						mostSeq = results[k];
					}
				}
			}
			counter = 0;
		}

		System.out.println("Most sequence word is: " + mostSeq + ";");
	}

}
