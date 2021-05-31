package ua.lviv.shved.salary;

public class VariableSalary implements Salary {
	int dailyHours;
	int nightHours;
	double rate;
	public VariableSalary(int dailyHours, int nightHours, double rate) {
		this.dailyHours = dailyHours;
		this.nightHours = nightHours;
		this.rate = rate;
	}
	@Override
	public void calculateSalary() {
		double salary = (nightHours*2.5*rate)+dailyHours*rate;
		System.out.println("Variable salary is: " + salary + " USD");
	}

}
