package ua.lviv.shved.robot;

public class Application {

	public static void main(String[] args) {
		Robot r = new Robot("Robot", "� ������ ������");
		r.work();
		CoffeRobot rc = new CoffeRobot("CoffeRobot", "� ���� ����");
		rc.work();
		RobotDancer rd = new RobotDancer("RobotDancer", "� ������ ������");
		rd.work();
		RobotCoocker rco = new RobotCoocker("RobotCoocker", "� ������ �����");
		rco.work();
		
		System.out.println();
		
		Robot arrayOfRobots [] = {r, rc, rd, rco};
		for (int i = 0; i<arrayOfRobots.length; i++) {
			arrayOfRobots[i].work();
		}
		}

}
