package ua.lviv.shved.set2;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println("������� ��������: ");
		System.out.println("������ 1, ��� ������ �����");
		System.out.println("������ 2, ��� �������� �����");
		System.out.println("������ 3, ��� ������� �����");
		System.out.println("������ 4, ��� ��������� �� ������");
		System.out.println("������ 5, ��� ��������� �� �������");
		System.out.println("������ 6, ��� ��������� �� �������");
		System.out.println("������ 7, ��� ��������� �� ����.");
		System.out.println("������ 8, ��� ������� ����� �� ���������� �������");
		System.out.println("������ 9, ��� ����� � ��������");
	}
	
	public static void main(String[] args) {
		Api storingOfCommodity = new Api();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();
			switch(sc.nextInt()) {
			case 1:{
				storingOfCommodity.addCommodity();
			}
			case 2:{
				storingOfCommodity.removeCommodity();
			}
			case 3:{
				storingOfCommodity.replaceCommodity();
			}
			case 4:{
				storingOfCommodity.nameSorting();
			}
			case 5:{
				storingOfCommodity.lenghtSorting();
			}
			case 6:{
				storingOfCommodity.weightSorting();
			}
			case 7:{
				storingOfCommodity.widthSorting();
			}
			case 8:{
				storingOfCommodity.getCommodity();
			}
			case 9:{
				System.exit(0);
				break;
			}
			default: {
				System.out.println("������� ������ �����");
				break;
			}
			}
		}
	}
}
