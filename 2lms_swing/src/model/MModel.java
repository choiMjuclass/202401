package model;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class MModel {

	public MModel() {
	}

	public String read(Scanner scanner) {
		String key = null;
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field: fields) {
				String fieldValue = scanner.next();
				field.setAccessible(true);
				field.set(this, fieldValue);
			}
			key = (String) fields[0].get(this);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return key;		
	}
	public void save(FileWriter fileWriter) {
		try {
			Field[] fields = this.getClass().getDeclaredFields();
			for (Field field: fields) {
				field.setAccessible(true);
				fileWriter.write(field.get(this) + " ");
			}
			fileWriter.write("\n");
		} catch (IllegalArgumentException | IllegalAccessException | IOException e) {
			e.printStackTrace();
		}
	}
}
