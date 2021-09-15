package ua.lviv.shved.annotation;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> annotationValuesList = getAnnotation(Phone.class);
		File file1 = new File("file1.txt");
		for (String string : annotationValuesList) {
			System.out.println(string);
		}
		writeList(annotationValuesList, file1);
		
		
	}

	public static List<String> getAnnotation(Class<?> customClass) {
		Field[] fields = customClass.getDeclaredFields();
		List<String> listOfAnnotations = new ArrayList<String>();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				listOfAnnotations.add("Field type is: " + field.getType().getSimpleName() + " --- and annotation is: "
						+ field.getAnnotation(MyAnnotation.class).value());
			}
		}
		return listOfAnnotations;

	}


	public static void writeList(List<String> list, File file) throws IOException {
		Files.write(file.toPath(), list);
		
	}


}
