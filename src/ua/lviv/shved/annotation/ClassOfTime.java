package ua.lviv.shved.annotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class ClassOfTime {
	public static void main(String[] args) {
		Date date1 = new Date();
		System.out.println(date1);
		System.out.println(toLocalDataTime(date1));
		System.out.println(toLocalTime(date1));
		System.out.println(toLocalData(date1));

	}
	public static LocalDateTime toLocalDataTime(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		return zdt.toLocalDateTime();
	}
	public static LocalTime toLocalTime(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		return zdt.toLocalTime();
	}
	public static LocalDate toLocalData(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		return zdt.toLocalDate();
	}
}
