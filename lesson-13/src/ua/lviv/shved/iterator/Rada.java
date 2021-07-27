package ua.lviv.shved.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public final class Rada {

	ArrayList<Affiliation> rada = new ArrayList<Affiliation>();
	

	public void addAffiliation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть фракцію:");
		String affName = sc.next();

		Affiliation aff = new Affiliation(affName);

		rada.add(aff);
		System.out.println(aff.toString() + " додано");
	}

	public void removeAffiliation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фракцію:");
		String aff = sc.next();

		boolean ifExists = isAffiliation(rada, aff);

		if (ifExists) {
			Iterator<Affiliation> iterator = rada.iterator();

			while (iterator.hasNext()) {
				Affiliation nextAffiliation = iterator.next();

				if (nextAffiliation.getNameOfAffiliation().equalsIgnoreCase(aff)) {
					iterator.remove();
					System.out.println("Ви видалили " + nextAffiliation.toString() + " із ради");

				}
			}
		} else {
			System.out.println("Такий депутат не існує)");
		}
	}

	public void getAllAffiliation() {
		System.out.println("Список фракцій:");
		for (Affiliation affiliation : rada) {
			System.out.println(affiliation.toString());
		}
	}

	public void getAffiliation() {
		System.out.println("Вкажіть фракцію:");
		Scanner sc = new Scanner(System.in);
		String affName = sc.next();

		for (Affiliation affiliation : rada) {
			if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
				System.out.println(affiliation.toString());
				affiliation.getAllAffiliation();
			}
		}
	}

	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву фракції:");
		String affName = sc.next();

		boolean ifExists = isAffiliation(rada, affName);

		if (ifExists) {
			for (Affiliation affiliation : rada) {
				if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
					affiliation.addDeputy();
				}
			}
		} else {
			System.out.println("Такої фракції не існує");
		}

	}

	public void removeDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву фракцію:");
		String affName = sc.next();

		boolean ifExists = isAffiliation(rada, affName);

		if (ifExists) {
			for (Affiliation affiliation : rada) {
				if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
					affiliation.removeDeputy();
				}
			}
		} else {
			System.out.println("Такої фракції не існує");
		}

	}

	public void getAllCorrupt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву фракцію:");
		String affName = sc.next();

		boolean ifExists = isAffiliation(rada, affName);

		if (ifExists) {
			for (Affiliation affiliation : rada) {
				if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
					System.out.println("Список корупціонерів:");
					affiliation.getAllCorrupt();
				}
			}
		} else {
			System.out.println("Такої фракції не існує");
		}

	}

	public void getMostCorrupt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву фракцію:");
		String affName = sc.next();

		boolean ifExists = isAffiliation(rada, affName);

		if (ifExists) {
			for (Affiliation affiliation : rada) {
				if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
					System.out.println(
							"Найбільший корупціонер у фракції" + affiliation.getNameOfAffiliation() + " - це:");
					affiliation.getMostCorrupt();
				}
			}
		} else {
			System.out.println("Такої фракції не існує");
		}

	}

	public void getAllDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву фракцію:");
		String affName = sc.next();

		boolean ifExists = isAffiliation(rada, affName);

		if (ifExists) {
			for (Affiliation affiliation : rada) {
				if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
					System.out.println("Всі депутати із фракції " + affiliation.getNameOfAffiliation() + " :");
					affiliation.getAllAffiliation();
				}
			}
		} else {
			System.out.println("Такої фракції не існує");
		}

	}
	private static Rada value = new Rada();

	private Rada() {
	}

	public static Rada getValue() {
		if (value == null) {
			value = new Rada();
		}

		return value;
	}
	static boolean isAffiliation(ArrayList<Affiliation> radaArray, String affName) {
		boolean flag = false;

		for (Affiliation affiliation : radaArray) {
			if (affiliation.getNameOfAffiliation().equalsIgnoreCase(affName)) {
				flag = true;
			}
		}

		return flag;
	}
}
