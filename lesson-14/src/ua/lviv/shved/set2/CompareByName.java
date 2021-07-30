package ua.lviv.shved.set2;

import java.util.Comparator;

public class CompareByName implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}
		else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}
		else return 0;
	}

}
