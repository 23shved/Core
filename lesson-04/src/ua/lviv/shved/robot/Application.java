package ua.lviv.shved.robot;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot("Robot", "я просто працюю");
		r.work();
		CoffeRobot rc = new CoffeRobot("CoffeRobot", "я варю каву");
		rc.work();
		RobotDancer rd = new RobotDancer("RobotDancer", "я просто танцюю");
		rd.work();
		RobotCoocker rco = new RobotCoocker("RobotCoocker", "я просто готую");
		rco.work();
		
		System.out.println();
		
		Robot arrayOfRobots [] = {r, rc, rd, rco};
		for (int i = 0; i<arrayOfRobots.length; i++) {
			arrayOfRobots[i].work();
		}
		}

}
