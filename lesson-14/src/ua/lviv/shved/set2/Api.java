package ua.lviv.shved.set2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Api {

	ArrayList<Commodity> commodityStore = new ArrayList<Commodity>();

	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву продукуту:");
		String name = sc.next();
		System.out.println("Вкажіть довжину продукуту:");
		int lenght = sc.nextInt();
		System.out.println("Вкажіть ширину продукуту:");
		int width = sc.nextInt();
		System.out.println("Вкажіть вагу продукуту:");
		int weight = sc.nextInt();

		Commodity commodity = new Commodity(name, lenght, width, weight);

		commodityStore.add(commodity);
		System.out.println(commodity.toString() + " було додано до списку");
	}

	public void removeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву продукуту:");
		String name = sc.next();
		System.out.println("Вкажіть довжину продукуту:");
		int lenght = sc.nextInt();
		System.out.println("Вкажіть ширину продукуту:");
		int width = sc.nextInt();
		System.out.println("Вкажіть вагу продукуту:");
		int weight = sc.nextInt();

		boolean check = isExist(commodityStore, name, lenght, width, weight);

		if (check) {
			Iterator<Commodity> iterator = commodityStore.iterator();

			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLenght() == lenght
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println(nextCommodity.toString() + " було видалено зі списку");
				}
			}
		} else {
			System.out.println("Такого продукту наразі не існує");
		}
	}
	public void replaceCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть назву продукуту:");
		String name = sc.next();
		System.out.println("Вкажіть довжину продукуту:");
		int lenght = sc.nextInt();
		System.out.println("Вкажіть ширину продукуту:");
		int width = sc.nextInt();
		System.out.println("Вкажіть вагу продукуту:");
		int weight = sc.nextInt();

		boolean check = isExist(commodityStore, name, lenght, width, weight);

		if (check) {

			for (Commodity commodity : commodityStore) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLenght() == lenght
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("Вкажіть нову назву продукуту:");
					String newName = sc.next();
					System.out.println("Вкажіть нову довжину продукуту:");
					int newLenght = sc.nextInt();
					System.out.println("Вкажіть нову ширину продукуту:");
					int newWidth = sc.nextInt();
					System.out.println("Вкажіть нову вагу продукуту:");
					int newWeight = sc.nextInt();
					
					commodity.setName(newName);
					commodity.setLenght(newLenght);
					commodity.setWidth(newWidth);
					commodity.setWeight(newWeight);
					System.out.println("Продукт було замінено на " + commodity.toString());
				}
			}
			
		} else {
			System.out.println("Такого продукту наразі не існує");
		}
	}
	
	public void nameSorting() {
		Collections.sort(commodityStore, new CompareByName());
		System.out.println("Сортування за назвою:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void lenghtSorting() {
		Collections.sort(commodityStore, new CompareByLength());
		System.out.println("Сортування за довжиною:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void widthSorting() {
		Collections.sort(commodityStore, new CompareByWidth());
		System.out.println("Сортування за шириною:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void weightSorting() {
		Collections.sort(commodityStore, new CompareByWeight());
		System.out.println("Сортування за вагою:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void getCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Вкажіть порядковий номер продукту:");
		int i = sc.nextInt();
		if(i<0 || i > (commodityStore.size()-1)) {
			System.out.println("Вказаний номер є завеликим, або замалим");
		}
		else {
			System.out.println("За вказаним порядковим номером є " + commodityStore.get(i).toString());
		}
		
	}
	
	static boolean isExist(ArrayList<Commodity> commodityStore, String name, int lenght, int width, int weight) {
		boolean flag = false;
		for (Commodity commodity : commodityStore) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLenght() == lenght
					&& commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}
		return flag;
	}
}
