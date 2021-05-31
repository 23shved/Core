package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	double a;
	double b;
	public MyCalculator(double a, double b) {
		this.a =a;
		this.b=b;
	}
	@Override
	public void plus() {
		double c = a+b;
		System.out.println("Calculation is equal: " + c);
	}

	@Override
	public void minus() {
		double c = a-b;
		System.out.println("Add calculation is equal: " + c);
		
	}

	@Override
	public void multiply() {
		double c = a*b;
		System.out.println("Substract calculation is equal: " + c);
		
	}

	@Override
	public void devide() {
		if (b==0) {
			System.out.println("Dividing by zero is not possible, unfortunately ;(");
		}
		else {
		double c = a/b;
		System.out.println("Dividing calculation is equal: " + c);
		}
	}

}
