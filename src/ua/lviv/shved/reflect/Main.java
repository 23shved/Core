package ua.lviv.shved.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class accountant = Accountant.class;

		System.out.println("Get simple name: " + accountant.getSimpleName());
		System.out.println("Get full name: " + accountant.getSimpleName());
		System.out.println("Get package name: " + accountant.getPackageName());

		int modifier = accountant.getModifiers();

		System.out.println("Get modifier class: " + modifier);

		String modifierText = Modifier.toString(modifier);
		System.out.println("Modifier for " + accountant.getSimpleName() + " is: " + modifierText);
		System.out.println("is static = " + Modifier.isStatic(modifier));

		System.out.println();

		Field[] fields = accountant.getDeclaredFields();
		System.out.println("Class has next " + fields.length + " fields:");

		for (Field field : fields) {
			System.out.println(field);
		}
		System.out.println();
		Constructor[] constructor = accountant.getDeclaredConstructors();
		System.out.println("Class has next " + constructor.length + " constructors:");

		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2);

		}
		System.out.println();

		Method[] method = accountant.getDeclaredMethods();
		System.out.println("Class has next " + method.length + " constructors:");
		for (Method method2 : method) {
			System.out.println(method2);

		}
		System.out.println();
		
		Constructor<Accountant> constructor2 = accountant.getConstructor(String.class, String.class);
		
		Accountant newInstance = constructor2.newInstance("Oleh", "NBS");
		Method accountantBasicMethod = accountant.getMethod("setName", String.class);
		accountantBasicMethod.invoke(newInstance, "Anatolii");
		System.out.println(newInstance);
		System.out.println(); 

		System.out.println("Method one:");
		Method accountantMethod = accountant.getMethod("countMoney", int.class);
		accountantMethod.invoke(newInstance, 958);
		System.out.println(); 
		System.out.println("Method two:");

		accountantMethod = accountant.getMethod("giveSalaryTo", String.class, int.class);
		accountantMethod.invoke(newInstance, "Shved Oleh ", 2300);
		System.out.println();

	}

}
