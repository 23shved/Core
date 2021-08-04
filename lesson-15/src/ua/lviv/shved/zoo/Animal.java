package ua.lviv.shved.zoo;

public class Animal {
	private String type;
	private String name;
	public Animal(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + "]";
	}
	
	
}
