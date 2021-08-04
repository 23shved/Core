package ua.lviv.shved.zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Zooclub {

	Map<Person, ArrayList<Animal>> zooclub = new HashMap<Person, ArrayList<Animal>>();

	public void addMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ім'я учасника");
		String name = sc.next();
		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();

		Person memberOfClub = new Person(name, age);
		zooclub.put(memberOfClub, new ArrayList<Animal>());
		System.out.println("Ви додали " + memberOfClub.toString() + " до клубу");

	}

	public void addAnimalToMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ім'я учасника");
		String name = sc.next();
		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();

		boolean check = isMemberExist(zooclub, name, age);
		if (check) {

			System.out.println("Введіть тип тваринки");
			String type = sc.next();
			System.out.println("Введіть ім'я тваринки");
			String animalName = sc.next();
			Animal animal = new Animal(type, animalName);
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooclub.entrySet().iterator();

			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					ArrayList<Animal> animals = nextMember.getValue();
					animals.add(animal);
					System.out.println(
							"Було додано " + animal.toString() + " зоолюбителю " + nextMember.getKey().toString());
				}
			}
		} else {
			System.out.println("Такого члена клубу ще немає");
		}

	}

	public void removeAnimalFromMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ім'я учасника");
		String name = sc.next();
		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();

		boolean check = isMemberExist(zooclub, name, age);
		if (check) {
			System.out.println("Введіть тип тваринки");
			String type = sc.next();
			System.out.println("Введіть ім'я тваринки");
			String animalName = sc.next();
			boolean check2 = isAnimalExist(zooclub, name, age, type, animalName);
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooclub.entrySet().iterator();

			if (check2) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					ArrayList<Animal> listOfAnimale = nextMember.getValue();
					Iterator<Animal> iterator2 = listOfAnimale.iterator();

					while (iterator2.hasNext()) {
						Animal nextAnimal = iterator2.next();
						if (nextAnimal.getName().equalsIgnoreCase(animalName)
								&& nextAnimal.getType().equalsIgnoreCase(type)) {
							iterator2.remove();
							System.out.println("Тваринку" + nextAnimal.toString() + " було видалено у валсника "
									+ nextMember.getKey().toString());
						}
					}
				}
			} else {
				System.out.println("У цього зоолюбителя немає такої тваринки");
			}
		} else {
			System.out.println("Такого зоолюбителя немає");
		}

	}

	public void removeMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть ім'я учасника");
		String name = sc.next();
		System.out.println("Введіть вік учасника");
		int age = sc.nextInt();
		boolean check = isMemberExist(zooclub, name, age);
		if (check) {
			Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooclub.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
				if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
					iterator.remove();
					System.out.println("з клубу зоолюителів було видалено " + nextMember.getKey().toString());
				}
			}
		}

	}

	public void removeAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть тип тваринки");
		String type = sc.next();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooclub.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
			ArrayList<Animal> ListOfAnimal = nextMember.getValue();
			Iterator<Animal> iterator2 = ListOfAnimal.iterator();
			while (iterator2.hasNext()) {
				Animal nextAnimal = iterator2.next();

				if (nextAnimal.getType().equalsIgnoreCase(type)) {
					iterator2.remove();
					System.out.println(nextAnimal.toString() + " цю тваринку було видалено  учасника клубу "
							+ nextMember.getKey().toString());
				}
			}
		}
	}

	public void showAllAnimal() {
		Set<Entry<Person, ArrayList<Animal>>> zooclubMembers = zooclub.entrySet();
		System.out.println("Список учасників зооклубу: ");
		for (Entry<Person, ArrayList<Animal>> entry : zooclubMembers) {
			System.out.println("Учасник клубу " + entry.getKey() + " та його тваринка " + entry.getValue());
		}

	}

	static boolean isMemberExist(Map<Person, ArrayList<Animal>> zooclub, String name, int age) {
		boolean flag = false;

		Set<Entry<Person, ArrayList<Animal>>> zooclubMembers = zooclub.entrySet();

		for (Entry<Person, ArrayList<Animal>> entry : zooclubMembers) {
			if (entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
				flag = true;
			}

		}

		return flag;

	}

	static boolean isAnimalExist(Map<Person, ArrayList<Animal>> zooclub, String name, int age, String type,
			String animalName) {
		boolean flag = false;

		Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooclub.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> nextMember = iterator.next();

			if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
				ArrayList<Animal> listOfAnimale = nextMember.getValue();
				Iterator<Animal> iterator2 = listOfAnimale.iterator();

				while (iterator2.hasNext()) {
					Animal nextAnimal = iterator2.next();
					if (nextAnimal.getName().equalsIgnoreCase(animalName)
							&& nextAnimal.getType().equalsIgnoreCase(type)) {
						flag = true;
					}
				}
			}
		}
		return flag;
	}

}