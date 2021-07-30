package ua.lviv.shved.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Human> humanSet = new HashSet<>();
		humanSet.add(new Human("Oleh", 23));
		humanSet.add(new Human("Oleh", 13));
		humanSet.add(new Human("Anatolii", 25));
		humanSet.add(new Human("Nikolai", 23));
		humanSet.add(new Human("Orest", 20));
		
		System.out.println("Before sorting in random order:");

		for (Human human : humanSet) {
			System.out.println(human);
		}
		System.out.println();
		
		Set<Human> humanTreeSet = new TreeSet<>();
		humanTreeSet.add(new Human("Oleh", 23));
		humanTreeSet.add(new Human("Oleh", 13));
		humanTreeSet.add(new Human("Anatolii", 25));
		humanTreeSet.add(new Human("Nikolai", 23));
		humanTreeSet.add(new Human("Orest", 20));
		
		System.out.println("After using comparable sorting:");

		for (Human human : humanTreeSet) {
			System.out.println(human);
		}
		System.out.println();
		Set<Human> humanTreeSet2 = new TreeSet<>(new HumanSorting());
		humanTreeSet2.add(new Human("Oleh", 23));
		humanTreeSet2.add(new Human("Oleh", 13));
		humanTreeSet2.add(new Human("Anatolii", 25));
		humanTreeSet2.add(new Human("Nikolai", 23));
		humanTreeSet2.add(new Human("Orest", 20));
		
		System.out.println("After using comparator sorting:");

		for (Human human : humanTreeSet2) {
			System.out.println(human);
		}
	}

}
