package ua.lviv.shved.set;

import java.util.Comparator;

public class HumanSorting implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else {
			if(o1.getAge()> o2.getAge()) {
				return 1;
			} else if (o1.getAge()< o2.getAge()) {
				return -1;
			}
		}
		
		return 0;
	}
	
	
}
