package ua.lviv.shved.animal;

public class Application {
	public static void main(String[] args) {
		Animal animal = new Animal("Котик", 25.5, 7);
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років");
		
		animal.setName("Песик");
		animal.setSpeed(999.99);
		animal.setAge(12);
		
		System.out.println("Назва тварини = " + animal.getName() + ", Швидкість тварини = " + animal.getSpeed() + " км/год, Вік тварини = " + animal.getAge() + " років");

		
	}
}
