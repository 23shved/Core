package ua.lviv.shved.animal;

public class Animal {

	private String name;
	private double speed;
	private int age;
	
	Animal(String name, double speed, int age){
		this.name = name;
		this.speed = speed;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public int getAge() {
		return age;
	}
	
}
