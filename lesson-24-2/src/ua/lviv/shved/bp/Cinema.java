package ua.lviv.shved.bp;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Cinema {
	private String name;
	private Time timeOpen;
	private Time timeClose;
	private TreeMap<Days, Schedule> schedules = new TreeMap<>();
	ArrayList<Movie> moviesLibrary = new ArrayList<>();
	Days[] days = Days.values();

	public Cinema() throws IncorectTimeException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Opening time of cinema: \n");
		System.out.print("Hour: ");
		int hourOpening = sc.nextInt();
		System.out.print("Min: ");
		int minOpening = sc.nextInt();
		System.out.println();

		System.out.println("Closing time of cinema: \n");
		System.out.print("Hour: ");
		int hourClosing = sc.nextInt();
		System.out.print("Min: ");
		int minClosing = sc.nextInt();
		System.out.println();

		this.timeOpen = new Time(hourOpening, minOpening);
		this.timeClose = new Time(hourClosing, minClosing);

		for (int i = 0; i < days.length; i++) {
			Schedule schedule = new Schedule();
			schedules.put(days[i], schedule);
		}

	}

	public void addMovie() throws IncorectTimeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie title:");
		String title = sc.nextLine();
		System.out.println("Movie duration: ");
		Time duration = Time.putTime();
		Movie newMovie = new Movie(title, duration);
		moviesLibrary.add(newMovie);
	}

	public void removeMovie() throws IncorectTimeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie title: ");
		String title = sc.nextLine();

		for (int i = 0; i < moviesLibrary.size(); i++) {
			if (moviesLibrary.get(i).getTitle().equals(title)) {
				moviesLibrary.remove(i);
				System.out.println("This movie was removed ");
			} else {
				System.out.println("This movie was not found ");
			}
		}
		for (Days d : days) {
			schedules.get(d).removeSeance(title);
		}
	}
	public void showSchedule() {
		for (Map.Entry<Days, Schedule> entry : schedules.entrySet()) {
			Days key = entry.getKey();
			Schedule value = entry.getValue();
			System.out.println(key + "\n   " + value + "\n");
			System.out.println("==========");
		}
	}
	public void showAllMovie() {
		for (Movie m : moviesLibrary) {
			System.out.println("You have next movies: " + m.getTitle());
		}
	}

	public void addSeanceExist() throws IncorectTimeException {
		System.out.println("Enter title of existed movie to add to seance: ");
		Scanner sc = new Scanner(System.in);
		String titleEntered = sc.nextLine();

		for (Movie m : moviesLibrary) {
			if (m.getTitle().equalsIgnoreCase(titleEntered)) {
				System.out.println("Enter day by number: ");
				int day = sc.nextInt();
				Time time = Time.putTime();
				Seance seance = new Seance(m, time);

				schedules.get(days[day]).getSchedule().add(seance);
				
				System.out.println("You added this movie");

			}
		}
	}

	public void addSeanceNotExist() throws IncorectTimeException {
		System.out.println("Enter title of existed movie to add to seance with new movie: ");
		Scanner sc = new Scanner(System.in);
		String titleEntered = sc.nextLine();
		Time durationEntered = Time.putTime();
		
		Movie movie = new Movie(titleEntered, durationEntered);
		moviesLibrary.add(movie);
		System.out.println("Enter day by number: ");
		int day = sc.nextInt();
		Time time = Time.putTime();
		Seance seance = new Seance(movie, time);
		
		schedules.get(days[day]).getSchedule().add(seance);

		;

	}
	public void removeSeance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day by number: ");
		int day = sc.nextInt()-1;
		System.out.println("Enter title of existed movie to remove from seance: ");
		String titleEntered = sc.nextLine();
		schedules.get(days[day]).removeSeance(titleEntered);
	}
}
