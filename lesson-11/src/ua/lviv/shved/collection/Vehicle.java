package ua.lviv.shved.collection;

public class Vehicle {
	private int hp;
	private int year;
	private Wheel wheel;
	private Engine engine;
	public Vehicle(int hp, int year, Wheel wheel, Engine engine) {
		super();
		this.hp = hp;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "[ Vehicle HorsePower is " + hp + ", created at " + year + ","  + wheel + "," + engine + "]";
	}
	
	
	
	
	
	
	
}
