package ua.lviv.shved;

public class MyClass {
	public static void main(String args[]) {
		String s = "Hello";
		boolean a = true;
		byte b = 1;
		short c = 65;
		int d = 22;
		long e = 999123987680L;
		char c1 = 'c';
		float pi = 3.14F;
		double k = 9.80665;


		System.out.println(s + " it's " + a + " here is your byte: " + b + ", short: " + c + ", integer: " + d + ", long: " + e + ", float: " + pi + ", double: " + k + ", and also your char: " + c1 + " ;)");

		System.out.println("Byte min value is: " + Byte.MIN_VALUE + " Byte max value is: " + Byte.MAX_VALUE);
		System.out.println("Short min value is: " + Short.MIN_VALUE + " Short max value is: " + Short.MAX_VALUE);
		System.out.println("Integer min value is: " + Integer.MIN_VALUE + " Integer max value is: " + Integer.MAX_VALUE);
		System.out.println("Long min value is: " + Long.MIN_VALUE + " Long max value is: " + Long.MAX_VALUE);
		System.out.println("Float min value is: " + Float.MIN_VALUE + " Float max value is: " + Float.MAX_VALUE);
		System.out.println("Double min value is: " + Double.MIN_VALUE + " Double max value is: " + Double.MAX_VALUE);
		System.out.println("Boolean min value is: false, Boolean max value is: true");

		int [] array1 = new int [10];
		array1[0]=123;
		for (int i = 1; i<array1.length; i++){
		array1[i] = 12*i/-1;
		}
		int maxValue = array1[0];
		for(int i=1;i < array1.length;i++){
		if(array1[i] > maxValue){
		maxValue = array1[i];
		}
		}
		int minValue = array1[0];
		for(int i=1;i<array1.length;i++){
		if(array1[i] < minValue){
		minValue = array1[i];
		}
		}
		System.out.println("Max value is: " + maxValue);
		System.out.println("Min value is: " + minValue);
		}
//first commit to GIT
}
