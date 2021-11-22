package ua.lviv.shved.bp;

import java.util.Set;
import java.util.TreeSet;

public class Schedule implements Comparable<Schedule>{

	private Set<Seance> schedule;
	private Integer id;
	public static int count = 0;
	
	
	public Schedule() {
		super();
		this.schedule = new TreeSet<>();
		this.id = count++;
	}


	public Set<Seance> getSchedule() {
		return schedule;
	}


	public void setSchedule(Set<Seance> schedule) {
		this.schedule = schedule;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	public Seance getSeanceId(int id) {
		
		for (Seance s : schedule) {
			if (s.getId() == id)
				return s;
		}
		
		return null;
	}
	public Seance getSeanceMovie(String title) {
		for (Seance s : schedule) {
		if (s.getMovie().getTitle().equalsIgnoreCase(title));
		return s;
		}
		return null;
		}
	
	public void showSchedule() {
		
		for (Seance s : schedule) {
			System.out.println();
			s.toString();	
		}
	}
	public void addSeance (Seance seance) {
		
		schedule.add(seance);
		
	}
	public void removeSeance (String title) {
		
		for(Seance s : schedule) {
			
			if(s.getMovie().getTitle().equalsIgnoreCase(title)) 
				schedule.remove(s);
			
		}
		
	}
	@Override
	public int compareTo(Schedule o) {
		 return id.compareTo(o.getId());
	}
	@Override
	public String toString() {
		return schedule + " ";
	}
}
