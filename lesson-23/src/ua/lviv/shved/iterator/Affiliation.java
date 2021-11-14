package ua.lviv.shved.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Supplier;


	public class Affiliation {
		public String nameOfAffiliation;

		public Affiliation(String nameOfAffiliation) {
			super();
			this.nameOfAffiliation = nameOfAffiliation;
		}

		public String getNameOfAffiliation() {
			return nameOfAffiliation;
		}

		public void setNameOfAffiliation(String nameOfAffiliation) {
			this.nameOfAffiliation = nameOfAffiliation;
		}

		ArrayList<Deputy> affiliation = new ArrayList<Deputy>();
		
		Supplier<Deputy> addDeputy =() -> {
			Scanner sc = new Scanner(System.in);

			System.out.println("Введіть прізвище:");
			String surname = sc.next();
			System.out.println("Введіть ім'я:");
			String name = sc.next();
			System.out.println("Введіть вік:");
			int age = sc.nextInt();
			System.out.println("Введіть ріст:");
			int weight = sc.nextInt();
			System.out.println("Введіть вагу:");
			int height = sc.nextInt();
			System.out.println("Вкажіть чи депутат є корупцінером::");
			boolean isCorrupt = sc.nextBoolean();
			return new Deputy(weight, height, surname, name, age, isCorrupt);
			
		};


		public void addDeputyManually() {
			Deputy deputy = new Deputy(12, 16, "Zele", "Volo", 45, true);
			Deputy deputy2 = new Deputy(12, 16, "Zele", "Volo", 45, true);
			Deputy deputy3 = new Deputy(12, 16, "Zele", "Volo", 45, true);
			Deputy deputy4 = new Deputy(12, 16, "Zele", "Volo", 45, true);
			deputy2.giveBribe();
			affiliation.add(deputy);
			affiliation.add(deputy2);
			affiliation.add(deputy3);
			affiliation.add(deputy4);

		}
		
		public void removeDeputy() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Введіть прізвище:");
			String surname = sc.next();
			System.out.println("Введіть ім'я:");
			String name = sc.next();

			boolean ifExists = isDeputy(affiliation, surname, name);

			if (ifExists) {
				Iterator<Deputy> iterator = affiliation.iterator();

				while (iterator.hasNext()) {
					Deputy dep = iterator.next();

					if (dep.getName().equalsIgnoreCase(name) && dep.getSurname().equalsIgnoreCase(surname)) {
						iterator.remove();
						System.out.println("Ви видалили " + dep.toString() + " із фракції");

					}
				}
			} else {
				System.out.println("Такий депутат не існує)");
			}
		}

		public void getAllCorrupt() {
			System.out.println("Всі корупціонери:");
			for (Deputy deputy : affiliation) {
				if(deputy.isCorrupt()) {
					System.out.println(deputy.toString());
				}
			}
		}
		
		public void getMostCorrupt() {
			System.out.println("Найбільший корупціонер:");
			
			Iterator<Deputy> iterator2 = affiliation.iterator();
			Deputy mostCorrup = null;

			while (iterator2.hasNext()) {
				Deputy dep2 = iterator2.next();

				if(dep2.isCorrupt()) {
				int maxBribe = 0;
				if (dep2.getSizeOfBribe()>maxBribe) {
					maxBribe = dep2.getSizeOfBribe();
					mostCorrup = dep2;
				}
				}
			}
			if (mostCorrup == null) {
				System.out.println("Немає корупціонерів");
			}
			else {
				System.out.println(mostCorrup);
			}

			
		}
		public void getAllAffiliation() {
			System.out.println("Фракція складається із:");
			for (Deputy deputy : affiliation) {
				System.out.println(deputy.toString());
			}
		}

		public void clearAffiliation() {

			affiliation.clear();
			System.out.println("Фракція чиста");
		}

		static boolean isDeputy(ArrayList<Deputy> affiliation, String surname, String name) {
			boolean flag = false;

			for (Deputy deputy : affiliation) {
				if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
					flag = true;
				}
			}

			return flag;
		}
		@Override
		public String toString() {
			return "Фракція \"" + getNameOfAffiliation() + "\"";
		}
}
