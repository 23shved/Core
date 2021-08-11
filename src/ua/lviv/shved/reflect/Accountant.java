package ua.lviv.shved.reflect;

import java.io.Serializable;

public class Accountant extends Human implements Serializable{

	public String name;
	public String companyName;
	public int knowledgeLevel;
	public int salary;

	public Accountant() {
		super();
	}

	public Accountant(String name, String companyName) {
		super();
		this.name = name;
		this.companyName = companyName;
	}

	public Accountant(String name, String companyName, int knowledgeLevel, int salary) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.knowledgeLevel = knowledgeLevel;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getKnowledgeLevel() {
		return knowledgeLevel;
	}

	public void setKnowledgeLevel(int knowledgeLevel) {
		this.knowledgeLevel = knowledgeLevel;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void countMoney(int amount) {
		System.out.println("Accountant counted " + amount + "$");
	}
	public void giveSalaryTo(String name, int amount) {
		System.out.println("Accountant gived " + amount + "$" + " to " + name); 
	}
	
	@Override
	public String toString() {
		return "Accountant [name=" + name + ", companyName=" + companyName + ", knowledgeLevel=" + knowledgeLevel
				+ ", salary=" + salary + "]";
	}

	
	
}
