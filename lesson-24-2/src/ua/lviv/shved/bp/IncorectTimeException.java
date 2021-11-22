package ua.lviv.shved.bp;

public class IncorectTimeException extends Exception {
	static final String message = "Incorect input";
	
	public IncorectTimeException() {
		super(message);
	}
}
