package ua.lviv.shved;

public class Application {
public static void main(String[] args) {
	int sumNubersvalue = sumNumbers(3,2); //можна використовувати повторно, як значення яке повертається
	double devidN = devideNumbers(12,2);
	System.out.println(sumNubersvalue);  
	System.out.println(devidN); 
	multiply(sumNubersvalue, (int)devidN); //просто виконує функцію, нічого не повертаючи 
} 

static int  sumNumbers(int a, int b) {
	return a+b;
	
}
static double  devideNumbers(int a, int b) {
	return a/b;
}
static void multiply(int a, int b) {
	System.out.println(a*b);
}
static double  substractNumbers(int a, int b) {
	return a-b;
}
}
