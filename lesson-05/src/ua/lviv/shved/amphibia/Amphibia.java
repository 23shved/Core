package ua.lviv.shved.amphibia;

public class Amphibia {
	
	String name;
	
	Amphibia(String name){
		this.name = name;
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public void sleep() {
		System.out.println(name + " is sleeping");
	}
	public void swim() {
		System.out.println(name + " is swimming");
	}
	public void walk() {
		System.out.println(name + " is walking");
	}
}
