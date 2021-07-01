package ua.lviv.shved.collection;

import java.util.Random;
import java.util.Scanner;


import java.util.Arrays;

public class Application {

	public static void main(String[] args) {

		Vehicle vehicleArray[][] = new Vehicle[getRandomValueFromRange(1, 7)][getRandomValueFromRange(1, 7)];
		ListOfMaterials material[] = ListOfMaterials.values();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			menu();
			switch(sc.nextLine()) {
			case "1":{
				for (int i = 0; i < vehicleArray.length; i++) {
					for (int j = 0; j < vehicleArray[i].length; j++) {
						vehicleArray[i][j] = new Vehicle(getRandomValueFromRange(100, 250), getRandomValueFromRange(1980, 2018),
								new Wheel(getRandomValueFromRange(35, 50),
										material[getRandomValueFromRange(0, material.length - 1)].toString()),
								new Engine(getRandomValueFromRange(2, 12)));
					}
				}
				System.out.println("Array is fulfilled by random data: ");
				System.out.println(Arrays.deepToString(vehicleArray));
				break;
			}
			case "2":{
				
						Vehicle auto = new Vehicle(777, 1111,
								new Wheel(888,
										material[1].toString()),
								new Engine(999));
						Vehicle vehicleArray2[] = new Vehicle[getRandomValueFromRange(1, 5)];
				
				Arrays.fill(vehicleArray2, auto);
				System.out.println(Arrays.deepToString(vehicleArray2));
				break;
			}
			default: System.out.println("Enter correct number");
			
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
