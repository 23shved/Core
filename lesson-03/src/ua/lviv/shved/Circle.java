package ua.lviv.shved;

public class Circle {
	private double r;
	private double d;
	
	Circle (double radius, double diameter){
		this.r = radius;
		this.d = diameter;
	}
	
	public double areaCircle() {
		return calculationOfareaCircle(r, d);
	}
	private double calculationOfareaCircle(double r, double d) {
		return Math.PI*(r*r);
	}
	public double widthCircle() {
		return calculationOfwidthCircle(r, d);
	}
	private double calculationOfwidthCircle(double r, double d) {
		return Math.PI*d;
	}
}
