package ua.lviv.shved.iterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");
		System.out.println("������ 9 ��� ������� ���������� ���������");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();

			switch (sc.next()) {
			case "1":{
				
				Rada.getValue().addAffiliation();
				break;
			}

			case "2":{
				
				Rada.getValue().removeAffiliation();;
				break;
			}
			case "3":{
				
				Rada.getValue().getAllAffiliation();;
				break;
			}
			case "4":{
				
				Rada.getValue().removeAffiliation();
				break;
			}
			case "5":{
				
				Rada.getValue().returnAffiliation();
				break;
			}
			case "6":{
				
				Rada.getValue().addDeputyToAffiliation();;
				break;
			}
			case "7":{
				
				Rada.getValue().removeDeputyToAffiliation();;
				break;
			}
			case "8":{
				
				Rada.getValue().getBribeDeputyFromAffiliation();
				break;
			}
			case "9":{
				
				Rada.getValue().getBigestBribeDeputyFromAffiliation();
				break;
			}
			default:{
				
			System.out.println("������� ���� �� 9 �����");
				break;
			}
		}
		
	}

}
}
