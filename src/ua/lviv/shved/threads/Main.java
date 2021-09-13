package ua.lviv.shved.threads;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter number to choose app: ");
		while (true) {
			
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Please enter number for app 1: ");

				int count = sc.nextInt();
				MyThread myThread = new MyThread(count);
				myThread.run();
				break;
			}
			case 2: {
				System.out.println("Please enter number for app 2 ");

				int count2 = sc.nextInt();
				RunnableThread myRunnableThread = new RunnableThread(count2);
				myRunnableThread.run();
				break;
			}
			
		}

		
	}
	}
}
