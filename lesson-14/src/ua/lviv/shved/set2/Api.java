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
		System.out.println("������ ����� ���������:");
		String name = sc.next();
		System.out.println("������ ������� ���������:");
		int lenght = sc.nextInt();
		System.out.println("������ ������ ���������:");
		int width = sc.nextInt();
		System.out.println("������ ���� ���������:");
		int weight = sc.nextInt();

		Commodity commodity = new Commodity(name, lenght, width, weight);

		commodityStore.add(commodity);
		System.out.println(commodity.toString() + " ���� ������ �� ������");
	}

	public void removeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���������:");
		String name = sc.next();
		System.out.println("������ ������� ���������:");
		int lenght = sc.nextInt();
		System.out.println("������ ������ ���������:");
		int width = sc.nextInt();
		System.out.println("������ ���� ���������:");
		int weight = sc.nextInt();

		boolean check = isExist(commodityStore, name, lenght, width, weight);

		if (check) {
			Iterator<Commodity> iterator = commodityStore.iterator();

			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLenght() == lenght
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println(nextCommodity.toString() + " ���� �������� � ������");
				}
			}
		} else {
			System.out.println("������ �������� ����� �� ����");
		}
	}
	public void replaceCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���������:");
		String name = sc.next();
		System.out.println("������ ������� ���������:");
		int lenght = sc.nextInt();
		System.out.println("������ ������ ���������:");
		int width = sc.nextInt();
		System.out.println("������ ���� ���������:");
		int weight = sc.nextInt();

		boolean check = isExist(commodityStore, name, lenght, width, weight);

		if (check) {

			for (Commodity commodity : commodityStore) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLenght() == lenght
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("������ ���� ����� ���������:");
					String newName = sc.next();
					System.out.println("������ ���� ������� ���������:");
					int newLenght = sc.nextInt();
					System.out.println("������ ���� ������ ���������:");
					int newWidth = sc.nextInt();
					System.out.println("������ ���� ���� ���������:");
					int newWeight = sc.nextInt();
					
					commodity.setName(newName);
					commodity.setLenght(newLenght);
					commodity.setWidth(newWidth);
					commodity.setWeight(newWeight);
					System.out.println("������� ���� ������� �� " + commodity.toString());
				}
			}
			
		} else {
			System.out.println("������ �������� ����� �� ����");
		}
	}
	
	public void nameSorting() {
		Collections.sort(commodityStore, new CompareByName());
		System.out.println("���������� �� ������:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void lenghtSorting() {
		Collections.sort(commodityStore, new CompareByLength());
		System.out.println("���������� �� ��������:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void widthSorting() {
		Collections.sort(commodityStore, new CompareByWidth());
		System.out.println("���������� �� �������:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void weightSorting() {
		Collections.sort(commodityStore, new CompareByWeight());
		System.out.println("���������� �� �����:");
		for (Commodity commodity : commodityStore) {
			System.out.println(commodity);
		}
	}
	public void getCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���������� ����� ��������:");
		int i = sc.nextInt();
		if(i<0 || i > (commodityStore.size()-1)) {
			System.out.println("�������� ����� � ���������, ��� �������");
		}
		else {
			System.out.println("�� �������� ���������� ������� � " + commodityStore.get(i).toString());
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
