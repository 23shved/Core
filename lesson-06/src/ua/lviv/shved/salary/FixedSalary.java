package ua.lviv.shved.salary;

public class FixedSalary implements Salary{
	int rank;
	double rate;
	
	public FixedSalary (int rank, double rate) {
		this.rank = rank;
		this.rate = rate;
	}
	@Override
	public void calculateSalary() {
		double salary = rank*52*rate;
		System.out.println("Fixed salary is: " + salary + " USD");
	}
}
