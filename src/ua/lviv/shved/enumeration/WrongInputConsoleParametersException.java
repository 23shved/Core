package ua.lviv.shved.enumeration;

public class WrongInputConsoleParametersException extends Exception{
	String message;

	public WrongInputConsoleParametersException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
