package ua.lviv.shved.plane;

public class SU27 extends Plane implements TurboAcceleration, StealthTech, NuclearShot{

	public SU27(int length, int width, int weight) {
		super(length, width, weight);
	}

	@Override
	public void nuclear() {
		int randomNumber =(int) (10 * Math.random()) + 1;
		System.out.println("Вдалось скинути " +randomNumber+ " боєголовок");
	}

	@Override
	public void stealth() {
		int randomTime =(int) (800 * Math.random());
		System.out.println("Технологію Стелс увікнено на " +randomTime+ " секунд");
	}

	@Override
	public void turbo() {
		int turboSpeed = (int) (2500 + 300 * Math.random());
		System.out.println("Завдяки увімкненню турбоприскорення вдалось досягти швидкості у " + turboSpeed + " км/год");
	}

}
