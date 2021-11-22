package ua.lviv.shved.bp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Time {
	private int min;
	private int hour;
	
	public Time(int hour, int min) throws IncorectTimeException {
		if ((hour>= 0 && hour< 24) && (min>= 0 && min< 60)){
			this.setHour(hour);
			this.setMin(min);
		}
		else 
			throw new IncorectTimeException();
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return  hour + " : " + min;
	}
	public static Time calcualteTime (Time time1, Time time2) throws IncorectTimeException {
		int hour = time1.getHour() + time2.getHour();
		int min = time1.getMin() + time2.getMin();
		
		if (min >=60) {
			hour += 1;
			min -=60;
		}
		else if(hour>=24) {
			hour -=24;
		}
		return new Time(hour, min);
	}
	public static  Time putTime () throws IncorectTimeException {
		Scanner sc = new Scanner(System.in).useDelimiter("[:,./\\s]");;
		List<Integer> time = new ArrayList<Integer>(Arrays.asList(null,null));
		System.out.print("Enter time hh/mm: ");

		for (int i = 0; sc.hasNextInt(); i++) {
			if (sc.hasNextInt())
				time.add(i, sc.nextInt());
		}
		if (time.size()-2>2) System.out.println("Incorrect time");
		int hour = Optional.ofNullable(time.get(0)).orElse(0);
		int min = Optional.ofNullable(time.get(1)).orElse(0);

		return new Time(hour,min);
	}
}
