package ua.lviv.shved.pet;

public class Main {

	public static void main(String[] args) {
		Pet cat = () -> "ί κ³ς- Μÿσσσ-Μÿσσσ";
		Pet cow = () -> "Μσσσ... ί - κξπξβΰ";
		Pet dog = () -> "ί οερ - Γΰσσσ-Γΰσσσ";
		voicse(cat.voice());
		voicse(dog.voice());
		voicse(cow.voice());

		
		
	}
	public static void voicse(String voice) {
		System.out.println(voice);
	}
}
