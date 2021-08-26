package ua.lviv.shved.inner;

public class Main {

	public static void main(String[] args) {

		Integer[] array = { 12, 23, -5, 123, 0, 22, 99, 54, 52, 12, -5 };

		Collection collection = new Collection(array);

		System.out.println("��������� ����� �������� �������� �� ����:");
		Iterator iteratorForward = collection.createForward();

		while (iteratorForward.hasnext()) {
			Integer next = iteratorForward.next();

			if (next % 2 != 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}

		System.out.println();

		System.out.println("��������� ���� �� ���������� �� ������� �������� ����� ���� �����:");
		Iterator iteratorBackward = collection.createBackward();

		while (iteratorBackward.hasnext()) {
			Integer next = iteratorBackward.next();

			System.out.println(next);

		}

		System.out.println();

		System.out.println(
				"��������� ���� �� ���������� �� ������� �������� ������ � �������� �������� �������� �������� ������ �� ���������� �� �� ��������:");
		Iterator iteratorAnonymous = collection.anonymousIterator();
		while (iteratorAnonymous.hasnext()) {
			Integer next = iteratorAnonymous.next();

			if (next % 2 == 0) {
				System.out.println("null");
			} else
				System.out.println(next);
		}
		System.out.println();

		System.out.println(
				"��������� ���� �� ������� �� ���������� �������� ������ � ��������� ����� ����� ������� ������, ���� �� ������ �� ������ �� ����� ����� 100, � ������� �� ������� �� �����:");

		Iterator iteratorLocal = collection.createLocaIterator();
		int count = 1;

		while (iteratorLocal.hasnext()) {
			Integer next = iteratorLocal.next();

			if (count % 5 == 0) {

				if (next % 2 == 0) {
					System.out.println(next - 100);
				} else
					System.out.println("null");
			}
			count++;
		}

		System.out.println();

		System.out.println(
				"��������� ���� �� ������� �� ���������� �������� ������ � ��������� ����� ������ ������� ����� �� �������, ���� �� ������, ��� ������� � ����� �������� � ������� ��� �������� �� �������:");

		Iterator iteratorStatic = collection.createStaticIterator();
		int k = 1;

		while (iteratorStatic.hasnext()) {
			Integer next = iteratorStatic.next();

			if (count % 2 == 0) {

				if (next % 2 == 0) {
					System.out.println(next + 1);
				} else
					System.out.println("null");
			}
			count++;
		}
	}

}
