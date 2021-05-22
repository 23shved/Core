package ua.lviv.shved.robot;

public class Robot {
	private String name;
	private String action;
	Robot (String name, String action){
		this.name = name;
		this.action = action;
	}
	
	public void work(){
		System.out.println("ß " + name + " - " + action + ";");
	}
	
}
