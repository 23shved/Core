package ua.lviv.shved.animal;

public class Application {
	public static void main(String[] args) {
		Animal animal = new Animal("�����", 25.5, 7);
		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ����");
		
		animal.setName("�����");
		animal.setSpeed(999.99);
		animal.setAge(12);
		
		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed() + " ��/���, ³� ������� = " + animal.getAge() + " ����");

		
	}
}
