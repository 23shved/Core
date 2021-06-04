package ua.lviv.shved.plane;

public class SU27 extends Plane implements TurboAcceleration, StealthTech, NuclearShot{

	public SU27(int length, int width, int weight) {
		super(length, width, weight);
	}

	@Override
	public void nuclear() {
		int randomNumber =(int) (10 * Math.random()) + 1;
		System.out.println("������� ������� " +randomNumber+ " ���������");
	}

	@Override
	public void stealth() {
		int randomTime =(int) (800 * Math.random());
		System.out.println("��������� ����� ������� �� " +randomTime+ " ������");
	}

	@Override
	public void turbo() {
		int turboSpeed = (int) (2500 + 300 * Math.random());
		System.out.println("������� ��������� ���������������� ������� ������� �������� � " + turboSpeed + " ��/���");
	}

}
