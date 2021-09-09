package ua.lviv.shved.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<Integer2> intList = new ArrayList<Integer2>(Arrays.asList(new Integer2("2d3"))); //переписавши клас Integer можна використат String в List<Integer>
		String text = intList.toString();
		System.out.println(text);
	

	
	MyMap<Integer, List<Integer>> newMap = new MyMap<>(11, new ArrayList<Integer>(Arrays.asList(23)));
	
	newMap.addNewEntry(23, new ArrayList<Integer>(Arrays.asList(3)))  ;
	newMap.addNewEntry(212, new ArrayList<Integer>(Arrays.asList(233)));
	newMap.addNewEntry(6753, new ArrayList<Integer>(Arrays.asList(553)));
	newMap.viewKey();
	newMap.viewValue();
	newMap.removeEntry(23);
	newMap.viewMap();


	}
	public static class Integer2 {
		String s;

		public Integer2(String s) {
			super();
			this.s = s;
		}

		public String getS() {
			return s;
		}

		public void setS(String s) {
			this.s = s;
		}

		@Override
		public String toString() {
			return "Integer [s=" + s + "]";
		}

	}

}
