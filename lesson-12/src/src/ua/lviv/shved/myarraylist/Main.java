package src.ua.lviv.shved.myarraylist;

public class Main {

	public static void main(String[] args) {
		PersonalArrayList myArray  = new PersonalArrayList(5);

		
		myArray.add("2");
		myArray.add("3");
		myArray.add("4");
		myArray.add("5");
		myArray.add("6");
		myArray.add("1",1);
		myArray.removeFrom(1);
		myArray.remove(3);
		myArray.removeFrom(2);
		
		
		System.out.println(myArray.toString());
		System.out.println(myArray.toString());


	}

}
