package ua.lviv.shved.pet;

public class Main {

	public static void main(String[] args) {
		Pet cat = () -> "� ��- �����-�����";
		Pet cow = () -> "����... � - ������";
		Pet dog = () -> "� ��� - �����-�����";
		voicse(cat.voice());
		voicse(dog.voice());
		voicse(cow.voice());

		
		
	}
	public static void voicse(String voice) {
		System.out.println(voice);
	}
}
