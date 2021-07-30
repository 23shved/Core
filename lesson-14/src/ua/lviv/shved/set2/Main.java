package ua.lviv.shved.set2;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println("¬ибер≥ть програму: ");
		System.out.println("¬вед≥ть 1, щоб додати товар");
		System.out.println("¬вед≥ть 2, щоб видалити товар");
		System.out.println("¬вед≥ть 3, щоб зам≥нити товар");
		System.out.println("¬вед≥ть 4, щоб сортувати за назвою");
		System.out.println("¬вед≥ть 5, щоб сортувати за висотою");
		System.out.println("¬вед≥ть 6, щоб сортувати за шириною");
		System.out.println("¬вед≥ть 7, щоб сортувати за ваго.");
		System.out.println("¬вед≥ть 8, щоб вивести товар за пор€дковим номером");
		System.out.println("¬вед≥ть 9, щоб вийти з програми");
	}
	
	public static void main(String[] args) {
		Api storingOfCommodity = new Api();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			switch(sc.nextInt()) {
			case 1:{
				storingOfCommodity.addCommodity();
			}
			case 2:{
				storingOfCommodity.removeCommodity();
			}
			case 3:{
				storingOfCommodity.replaceCommodity();
			}
			case 4:{
				storingOfCommodity.nameSorting();
			}
			case 5:{
				storingOfCommodity.lenghtSorting();
			}
			case 6:{
				storingOfCommodity.weightSorting();
			}
			case 7:{
				storingOfCommodity.widthSorting();
			}
			case 8:{
				storingOfCommodity.getCommodity();
			}
			case 9:{
				System.exit(0);
				break;
			}
			default: {
				System.out.println("¬ведено нев≥рне число");
				break;
			}
			}
		}
	}
}
