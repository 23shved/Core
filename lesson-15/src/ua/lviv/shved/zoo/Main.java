package ua.lviv.shved.zoo;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, щоб додати учасника клубу");
		System.out.println("Введіть 2, щоб додати тваринку до учасника клубу");
		System.out.println("Введіть 3, щоб видалити тваринку в учасника клубу");
		System.out.println("Введіть 4, щоб видалити учасника з клубу");
		System.out.println("Введіть 5, щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Введіть 6, щоб відобразити всіх учасників та тваринок зооклубу");
		System.out.println("Введіть 7, щоб вийти з програми");
	}
	
	public static void main(String[] args) {
		Zooclub zooclub = new Zooclub();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menu();
			
			switch(sc.nextInt()) {
			case 1:{
				zooclub.addMember();
				break;
			}
			case 2:{
				zooclub.addAnimalToMember();
				break;
			}
			case 3:{
				zooclub.removeAnimalFromMember();
				break;
			}
			case 4:{
				zooclub.removeMember();
				break;
			}
			case 5:{
				zooclub.removeAnimal();
				break;
			}
			case 6:{
				zooclub.showAllAnimal();
				break;
			}
			case 7:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("Не правильно вибрано програму");
			}
		}
	}
}
