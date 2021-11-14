package ua.lviv.shved.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
	
	Supplier<Affiliation> getAffiliation = () -> {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Вкажіть фракцію:");
		String AffiliationName = scanner.next();

		return new Affiliation(AffiliationName);
	};
	
	public Optional<Affiliation> findAffiliation() {
		Affiliation AffiliationTyped = getAffiliation.get();

		Predicate<Affiliation> isEqualAffiliation = deputyGroup -> deputyGroup.getNameOfAffiliation().equalsIgnoreCase(AffiliationTyped.getNameOfAffiliation());
		Optional<Affiliation> AffiliationFound = rada.stream().filter(isEqualAffiliation).findFirst();

		return AffiliationFound;
	}
	
	public void removeAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			rada.remove(affiliationFound.get());
			System.out.println(affiliationFound.get().toString() + " додано до фракції");
		} else {
			System.out.println("Такої фракції не існує");
		}
	}

	public void getAllAffiliation() {
		System.out.println("Список фракцій:");
		rada.forEach(System.out::println);
	}

	public void returnAffiliation() {
		System.out.println("Вкажіть фракцію:");
		Optional<Affiliation> affiliationFound = findAffiliation();
		if(affiliationFound.isPresent()) {
			System.out.println(affiliationFound.get().toString());
			affiliationFound.get().getAllAffiliation();
		}
		else {
			System.out.println("Такої фракції не існує");
		}
		
	}
	public void addDeputyToAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			affiliationFound.get().addDeputyManually();
		} else {
			System.out.println("Такої фракції не існує");
		}
	}
	public void removeDeputyToAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			affiliationFound.get().removeDeputy();
		} else {
			System.out.println("Такої фракції не існує");
		}
	}
	public void getBribeDeputyFromAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			affiliationFound.get().getAllCorrupt();
		} else {
			System.out.println("Такої фракції не існує");
		}
	}
	public void getBigestBribeDeputyFromAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			affiliationFound.get().getMostCorrupt();
		} else {
			System.out.println("Такої фракції не існує");
		}
	}
	public void getAllDeputyFromAffiliation() {
		Optional<Affiliation> affiliationFound = findAffiliation();

		if (affiliationFound.isPresent()) {
			affiliationFound.get().getAllAffiliation();
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

}
