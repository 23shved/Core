package ua.lviv.shved.exception;

public class MyException extends Exception{
	String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


}
