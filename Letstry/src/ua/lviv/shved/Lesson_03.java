package ua.lviv.shved;

public class Lesson_03 {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(9,3);
		
		Rectangle r2 = new Rectangle();
		r2.setWidth(35);
		r2.setHeight(25);

		System.out.println("����� ������������ = " + r1.areaRect());
		System.out.println("�������� ������������ = " + r1.perimeterRect());
		
		System.out.println("����� ������� ������������ = " + r2.areaRect());
		System.out.println("�������� ������� ������������ = " + r2.perimeterRect());
		
		Circle c1 = new Circle(12,2.2);
		
		System.out.println("����� ���� = " + c1.areaCircle());
		System.out.println("������� ���� = " + c1.widthCircle());
		
		
	}

}
