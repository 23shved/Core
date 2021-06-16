package ua.lviv.shved.enumeration;

import java.util.Scanner;

/**
 * @since java 1.8
 * @author Oleh
 * @version 1.1
 * */

public class Application {
	
	/* enumeration of seasons */

	enum Seasons {
		WINTER, SPRING, SUMMER, FALL;
	}

	/* enumeration of months */
	
	enum Month {
		January(31, Seasons.WINTER), February(28, Seasons.WINTER), March(31, Seasons.SPRING), April(30, Seasons.SPRING),
		May(31, Seasons.SPRING), June(30, Seasons.SUMMER), July(31, Seasons.SUMMER), August(31, Seasons.SUMMER),
		September(30, Seasons.FALL), October(31, Seasons.FALL), November(30, Seasons.FALL),
		December(31, Seasons.WINTER);

		private int days;
		Seasons se;

		public int getDays() {
			return days;
		}

		public Seasons getSe() {
			return se;
		}

		Month(int days, Seasons se) {
			this.days = days;
			this.se = se;
		}
	}
	/**
	 * @param num of program
	 * @exception No Exceptions
	 * @author Oleh
	 * @return null
	 * @see java code convention
	 * */
	
	static void menu() {
		System.out.println("Натичніть 1, щоб перевірити чи є такий місяць");
		System.out.println("Натичніть 2, щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натичніть 3, щоб вивести на екран всі місяці які мають таку саму кількість днів");
		System.out.println("Натичніть 4, щоб вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натичніть 5, щоб вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натичніть 6, щоб вивести на екран наступну  пору року");
		System.out.println("Натичніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натичніть 8, щоб вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натичніть 9, щоб вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натичніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {
		Scanner sc = new Scanner(System.in);

		Month[] mArray = Month.values();
		String message = "Такий місяць не існує(((((";
		String message2 = "Введеної програми не існує";
		
		/* while cycle to run a program */

		while (true) {
//			menu();

			switch (sc.next()) {
			case "1": {
				System.out.println("Вибрано 1 програму");
				String mSc = sc.next().toUpperCase();
				boolean flag = isMonthPresent(mArray, mSc);

				if (!flag) {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}

			case "2": {
				System.out.println("Вибрано 2 програму");

				String mSc = sc.next().toUpperCase();
				boolean flag = false;
				String cont = null;
				for (Month m : mArray) {

					if (mSc.toUpperCase().equals(m.name().toUpperCase())) {
						cont = m.getSe().name();
						flag = true;
					}
				}
				if (flag) {
					for (Month m : mArray) {

						if (cont.equals(m.getSe().name())) {
							System.out.println(m.name());
						}
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "3": {
				System.out.println("Вибрано 3 програму");

				String mSc = sc.next().toUpperCase();
				int days = daysEqual(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					for (Month m : mArray) {

						if (days == m.getDays()) {
							System.out.println(m.name());
						}
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "4": {
				System.out.println("Вибрано 4 програму");

				String mSc = sc.next().toUpperCase();
				int days = daysEqual(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					for (Month m : mArray) {

						if (days > m.getDays()) {
							System.out.println(m.name());
						}
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "5": {
				System.out.println("Вибрано 5 програму");

				String mSc = sc.next().toUpperCase();
				int days = daysEqual(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					for (Month m : mArray) {

						if (days < m.getDays()) {
							System.out.println(m.name());
						}
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "6": {
				System.out.println("Вибрано 6 програму");

				String mSc = sc.next().toUpperCase();
				int order = orderIs(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					if (order >= mArray.length - 1) {
						System.out.println(mArray[0]);
					} else {
						System.out.println(mArray[order + 1]);
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "7": {
				System.out.println("Вибрано 7 програму");

				String mSc = sc.next().toUpperCase();
				int order = orderIs(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					if (order == 0) {
						System.out.println(mArray[mArray.length - 1]);
					} else {
						System.out.println(mArray[order - 1]);
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}
			case "8": {
				System.out.println("Вибрано 8 програму");
				for (Month m : mArray) {

					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());
					}
				}

				break;
			}
			case "9": {
				System.out.println("Вибрано 9 програму");
				for (Month m : mArray) {

					if (m.getDays() % 2 != 0) {
						System.out.println(m.name());
					}
				}

				break;
			}
			case "10": {
				System.out.println("Вибрано 10 програму");

				String mSc = sc.next().toUpperCase();
				boolean even = isEven(mArray, mSc);
				boolean flag = isMonthPresent(mArray, mSc);

				if (flag) {
					if (even) {
						System.out.println("Парний");
					} else {
						System.out.println("Не парний");
					}
				} else {
					throw new WrongInputConsoleParametersException(message);
				}
				break;

			}
			case "menu": {
				menu();

			}
			default:
				throw new WrongInputConsoleParametersException(message2);
			}
		}

	}
	
	/* method to check if month is present */
	
	private static boolean isMonthPresent(Month[] mArray, String mSc) {
		boolean flag = false;

		for (Month m : mArray) {

			if (m.name().toUpperCase().equals(mSc)) {
				flag = true;
				System.out.println("Такий місяць існує)))))))");
			}
		}
		return flag;
	}
	
	/* method to check to find equal days */

	private static int daysEqual(Month[] mArray, String mSc) {
		int days = 0;

		for (Month m : mArray) {

			if (mSc.equals(m.name().toUpperCase())) {
				days = m.getDays();
			}
		}
		return days;
	}

	/* method to check to find order of month */
	
	private static int orderIs(Month[] mArray, String mSc) {
		int order = 0;

		for (Month m : mArray) {

			if (mSc.equals(m.name().toUpperCase())) {
				order = m.ordinal();
			}
		}
		return order;
	}
	
	/* method to check if month is even or odd */

	private static boolean isEven(Month[] mArray, String mSc) {
		boolean even = false;
		int evenorood = 1;
		for (Month m : mArray) {

			if (mSc.equals(m.name().toUpperCase())) {
				evenorood = m.getDays() % 2;
			}
			if (evenorood == 0) {
				even = true;
			}
		}
		return even;

	}
}
