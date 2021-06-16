package ua.lviv.shved.exception;

public class Methods extends Exception{
	public int a;
	public int b;
	public String message = "Both numbers are positive this is my exception";
	
	public Methods(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	void multiply() throws MyException { 
		if(a<0 && b<0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if((a==0 && b!=0) || (a!=0 && b==0) ) {
			throw new ArithmeticException("This is Arithmetic Exception"); 
		}
		if(a==0 && b==0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if(a>0 && b>0) {
			throw new MyException(message); 
		}
		System.out.println(a * b);
	}
	void divide() throws MyException{ 
		if(a<0 && b<0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if((a==0 && b!=0) || (a!=0 && b==0) ) {
			throw new ArithmeticException("This is Arithmetic Exception"); 
		}
		if(a==0 && b==0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if(a>0 && b>0) {
			throw new MyException(message); 
		}
		System.out.println(a / b);
	}
	void substract() throws MyException{ 
		if(a<0 && b<0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if((a==0 && b!=0) || (a!=0 && b==0) ) {
			throw new ArithmeticException("This is Arithmetic Exception"); 
		}
		if(a==0 && b==0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if(a>0 && b>0) {
			throw new MyException(message); 
		}
		System.out.println(a / b);
	}
	void add() throws MyException{ 
		if(a<0 && b<0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if((a==0 && b!=0) || (a!=0 && b==0) ) {
			throw new ArithmeticException("This is Arithmetic Exception"); 
		}
		if(a==0 && b==0) {
			throw new IllegalStateException("This is Illegal State Exception"); 
		}
		if(a>0 && b>0) {
			throw new MyException(message); 
		}
		System.out.println(a / b);
	}

}
