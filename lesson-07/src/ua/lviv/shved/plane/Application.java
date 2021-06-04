package ua.lviv.shved.plane;

public class Application {
	public static void main(String[] args) {
	
		SU27 su27 = new SU27(22, 15, 3000);
		
		su27.engineStart();
		su27.planeTakeoff();
		su27.moveTop();
		su27.moveLeft();
		su27.moveBottom();
		su27.moveRight();
		su27.stealth();
		su27.nuclear();
		su27.turbo();
		su27.planeLanding();

	}
	
		
	
}
