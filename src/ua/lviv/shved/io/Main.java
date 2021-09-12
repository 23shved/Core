package ua.lviv.shved.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee emp1 = new Employee("Oleh", 23, 99999);

		File file1 = new File("ListOfEmploee.txt");
		File file2 = new File("ArrayListOfEmploee.txt");

		
		Methods.serialize(emp1, file1);
		System.out.println(Methods.deserialize(file1));

		Employee emp2 = (Employee) Methods.deserialize(file1);
		System.out.println(emp2.toString());
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(new Employee("Arturo", 53, 999));
		empList.add(new Employee("Anhela", 16, 1299));
		empList.add(new Employee("Nikolai", 99, 9319));
		empList.add(new Employee("Olivier", 75, 7674));

		for (Employee employee : empList) {
			Methods.serialize(employee, file2);
			
		}

	}

}
