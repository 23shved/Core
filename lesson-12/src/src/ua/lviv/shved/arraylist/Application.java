package src.ua.lviv.shved.arraylist;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<ListOfMaterials> material = new ArrayList<ListOfMaterials>();

		for (ListOfMaterials materialv : ListOfMaterials.values()) {
			material.add(materialv);
		}
		Scanner sc = new Scanner(System.in);
		List<Vehicle> automobile = new ArrayList<Vehicle>();

		while (true) {

			menu();
			switch (sc.nextLine()) {
			case "1": {

				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					List<Vehicle> automobile1 = new ArrayList<Vehicle>();

					for (int j = 0; j < getRandomValueFromRange(1, 5); j++) {
						automobile1.add(new Vehicle(getRandomValueFromRange(100, 250),
								getRandomValueFromRange(1980, 2018),
								new Wheel(getRandomValueFromRange(35, 50),
										material.get(getRandomValueFromRange(0, material.size() - 1)).toString()),
								new Engine(getRandomValueFromRange(2, 12))));
					}
					automobile.addAll(automobile1);

				}

				System.out.println("Array is fulfilled by random data: ");
				System.out.println(automobile);
				break;
			}
			case "2": {

				Vehicle auto = new Vehicle(777, 1111, new Wheel(888, material.get(1).toString()), new Engine(999));

				for (int i = 0; i < getRandomValueFromRange(1, 5); i++) {
					automobile.add(auto);
				}

				System.out.println(automobile);
				break;
			}
			case "clear": {

				automobile.clear();
				break;
			}
			default:
				System.out.println("Enter correct number");

			}

		}

	}

	static void menu() {
		System.out.println("Choose the program: ");
	}

	static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("Min value must be less than max value!");
		}

		Random randomValue = new Random();
		return randomValue.nextInt(max - min + 1) + min;
	}

}
