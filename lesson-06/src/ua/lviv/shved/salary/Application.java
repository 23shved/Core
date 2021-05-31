package ua.lviv.shved.salary;

public class Application {

	public static void main(String[] args) {
		VariableSalary vs = new VariableSalary(82,102,12.5);
		vs.calculateSalary();
		FixedSalary fs = new FixedSalary(12,8.5);
		fs.calculateSalary();
	}

}
