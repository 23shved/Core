package ua.lviv.shved.zoo;

import java.util.Scanner;

public class Main {
	static void menu() {
		System.out.println();
		System.out.println("������ 1, ��� ������ �������� �����");
		System.out.println("������ 2, ��� ������ �������� �� �������� �����");
		System.out.println("������ 3, ��� �������� �������� � �������� �����");
		System.out.println("������ 4, ��� �������� �������� � �����");
		System.out.println("������ 5, ��� �������� ��������� �������� � ��� ��������");
		System.out.println("������ 6, ��� ���������� ��� �������� �� �������� ��������");
		System.out.println("������ 7, ��� ����� � ��������");
	}
	
	public static void main(String[] args) {
		Zooclub zooclub = new Zooclub();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			menu();
			
			switch(sc.nextInt()) {
			case 1:{
				zooclub.addMember();
				break;
			}
			case 2:{
				zooclub.addAnimalToMember();
				break;
			}
			case 3:{
				zooclub.removeAnimalFromMember();
				break;
			}
			case 4:{
				zooclub.removeMember();
				break;
			}
			case 5:{
				zooclub.removeAnimal();
				break;
			}
			case 6:{
				zooclub.showAllAnimal();
				break;
			}
			case 7:{
				System.exit(0);
				break;
			}
			default:
				System.out.println("�� ��������� ������� ��������");
			}
		}
	}
}
