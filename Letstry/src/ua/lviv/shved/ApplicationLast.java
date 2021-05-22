package ua.lviv.shved;

public class ApplicationLast {
	public static void main(String[] args) {
		System.out.println("-----1-----");

		int num = 1;

		sequenceIncrease(num);

		System.out.println("-----2-----");

		int num2 = 90;

		sequenceDecrease(num2);

		System.out.println("-----3-----");

		int n = 2;

		isEven(n);

		System.out.println("-----4-----");

		double a = 10.325;
		double b = 9.715;

		closestNumb(a, b);

		System.out.println("-----5-----");

		int[] array = { 1, 13, 31, 11, -12, 8, -33, 90, 10, 1, 12, -32};

		minmaxArray(array);

	}

	static void sequenceIncrease(int num) {
		while (num <= 55) {
			System.out.println(num);
			num += 2;
		}
	}

	static void sequenceDecrease(int num2) {
		while (num2 >= 0) {
			System.out.println(num2);
			num2 -= 5;
		}
	}

	static void isEven(int n) {
		System.out.println("Ваше число: " + n);
		if (n % 2 == 0) {
			System.out.println("Парне");
		} else {
			System.out.println("Непарне");
		}
	}

	static void closestNumb(double a, double b) {

		double differenceA = Math.abs(10 - a);
		double differenceB = Math.abs(10 - b);

		if (differenceA < differenceB) {
			System.out.println("Серед вказаних вами чисел " + a + " та " + b + " найблищим до 10 є:");
			System.out.println(a);
		} else if (differenceA > differenceB) {
			System.out.println("Серед вказаних вами чисел " + a + " та " + b + " найблищим до 10 є:");
			System.out.println(b);
		} else {
			System.out.println("Вказані числа є рівними");
		}

	}

	static void minmaxArray(int[] array) {
		int tempMin = array[0];
		int tempMax = array[0];
		for (int i = -1; i < array.length - 1; i++) {
			if (tempMin > array[i + 1]) {
				tempMin = array[i + 1];
			}
		}
		for (int k = 0; k < array.length - 1; k++) {
			if (tempMax < array[k + 1]) {
				tempMax = array[k+1];
			}
		}
		System.out.println("У вашому масиві:");
		System.out.println("Найменшим числом є " + tempMin);
		System.out.println("Найбільшим числом є " + tempMax);

	}
}
