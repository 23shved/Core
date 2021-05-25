package ua.lviv.shved.overloading;

public class Overload {
	private String name;
	private int age;
	private double salary;
	Overload(String name, int age){
		this.name = name;
		this.age = age;
		}
	Overload(String name, int age, double salary){
		this(name, age);
		this.salary = salary;
	}
	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Salary is " + salary);
	}

}
