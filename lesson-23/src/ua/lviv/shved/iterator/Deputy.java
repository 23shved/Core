package ua.lviv.shved.iterator;

import java.util.Scanner;
import java.util.function.Supplier;

public class Deputy extends Human{
	private String surname;
	private String name;
	private int age;
	private boolean isCorrupt;
	private int sizeOfBribe;
	
	
	public Deputy(int weight, int height, String surname, String name, int age, boolean isCorrupt) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.isCorrupt = isCorrupt;
	}
	


	public void giveBribe() {
		if (isCorrupt == false) {
			System.out.println("Цей депутат не бере хабарів");
		}
		else {
			Scanner sc = new Scanner(System.in);
			System.out.println("Вкажіть розмір хабаря:");
			int givenBribe = sc.nextInt();
			
			if(givenBribe>=5000) {
				System.out.println("Хабарник отримав" + givenBribe + "$ хабаря \n Полція ув'язнить хабарника)");
			}
			else {
				this.sizeOfBribe += givenBribe;
			}
		}
	}

	Supplier<Integer> giveBribeSteream = () -> {
		Scanner sc = new Scanner(System.in);
		int givenBribe = sc.nextInt();

		return givenBribe;
	};
	
	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isCorrupt() {
		return isCorrupt;
	}


	public void setCorrupt(boolean isCorrupt) {
		this.isCorrupt = isCorrupt;
	}


	public int getSizeOfBribe() {
		return sizeOfBribe;
	}


	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}



	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", isCorrupt=" + isCorrupt
				+ ", sizeOfBribe=" + sizeOfBribe + "]";
	}
	

	
}
