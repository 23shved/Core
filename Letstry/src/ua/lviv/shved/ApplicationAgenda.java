package ua.lviv.shved;

public class ApplicationAgenda {
	public static void main(String[] args) {
		
		String dayToday = "Saturday";
		
		switch (dayToday) {
		case "Monday":
			System.out.println("Your agenda for today is: \n 1) Wake up; \n 2) Cry; \n 3) Work; \n 4) Cry; \n 5) Sleep;");
			break;
		case "Tuesday":
			System.out.println("Your agenda for today is: \n 1) Wake up; \n 2) Take a shower; \n 3) Work; \n 4) Finally dinner; \n 5) Sleep;");
			break;
		case "Wednesday":
			System.out.println("Your agenda for today is: \n 1) Wake up; \n 2) Work \n 3) Work \n 4) Work \n 5) Sleep");
			break;
		case "Thursday":
			System.out.println("Your agenda for today is: \n 1) Wake up; \n 2) Work; \n 3) Be patient; \n 4) Work; \n 5) Sleep;");
			break;
		case "Friday":
			System.out.println("Your agenda for today is: \n 1) Wake up; \n 2) Finally friday; \n 3) Sleep;");
			break;
		case "Saturday":
			System.out.println("Your agenda for today is: \n Do whatever you want, you are free Jango)");
			break;
		case "Sunday":
			System.out.println("Your agenda for today is: \n Sleep all day long)");
			break;
		default:
			System.out.println("Enter valid day");
			break;
		}
	}
	
	
}
