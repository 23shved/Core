package ua.lviv.shved.iterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();

			switch (sc.next()) {
			case "1":{
				
				Rada.getValue().addAffiliation();
				break;
			}

			case "2":{
				
				Rada.getValue().removeAffiliation();;
				break;
			}
			case "3":{
				
				Rada.getValue().getAllAffiliation();;
				break;
			}
			case "4":{
				
				Rada.getValue().removeAffiliation();
				break;
			}
			case "5":{
				
				Rada.getValue().getAffiliation();;
				break;
			}
			case "6":{
				
				Rada.getValue().addDeputy();;
				break;
			}
			case "7":{
				
				Rada.getValue().removeDeputy();;
				break;
			}
			case "8":{
				
				Rada.getValue().getAllCorrupt();;
				break;
			}
			case "9":{
				
				Rada.getValue().getMostCorrupt();
				break;
			}
			default:{
				
			System.out.println("иберіть одну із 9 опцій");
				break;
			}
		}
		
	}

}
}
