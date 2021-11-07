package ua.lviv.shved.amphibia;

public class Main {

	public static void main(String[] args) {

		Amphibia amphibia1;
		
		amphibia1 = action -> {
			if (action.equalsIgnoreCase("Sleep") )return "I'm frog and I'm sleeping";
			else if (action.equalsIgnoreCase("Eat") )return "I'm frog and I'm eating";
			else if (action.equalsIgnoreCase("Swim") )return "I'm frog and I'm swimming";
			else if (action.equalsIgnoreCase("Walk") )return "I'm frog and I'm walking";
			else return "Frog don't know what to do";
		};
		
		
		System.out.println(amphibia1.action("eat"));
		System.out.println(amphibia1.action("Sleep"));
		System.out.println(amphibia1.action("Swim"));
		System.out.println(amphibia1.action("walk"));
		System.out.println(amphibia1.action("Dring"));

	}

}
