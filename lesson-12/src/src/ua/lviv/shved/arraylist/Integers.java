package src.ua.lviv.shved.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Integers {

	public static void main(String[] args) {
		Integer[] newArray = new Integer[10];

		for (int i = 0; i <= newArray.length - 1; i++) {
			int k = new Random().nextInt(100);
			newArray[i] = k;
		}
		Arrays.sort(newArray);
		System.out.println("ASC sorting:");
		System.out.println(Arrays.toString(newArray));

		Arrays.sort(newArray, Collections.reverseOrder());
		System.out.println("DESC sorting:");
		System.out.println(Arrays.toString(newArray));

	}

}
