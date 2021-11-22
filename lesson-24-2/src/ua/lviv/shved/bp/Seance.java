package ua.lviv.shved.bp;



public class Seance implements Comparable<Seance>{
	private Movie movie;
	private Time startTime;
	private Time endTime;
	private Integer start;
	private Integer id;
	public static int count = 0;
	
	public Seance(Movie movie, Time startTime) throws IncorectTimeException {
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = Time.calcualteTime(startTime, movie.getDuration());
		this.start = startTime.getHour();
		this.id = count++;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Integer getStart() {
		return start;
	}

	public Integer getId() {
		return id;
	}

//	@Override
//	public int compareTo(Seance o) {
//		return start.compareTo(o.getStart());
//	}
	
	@Override
	public String toString() {
		return "\n" + movie + ", beginning =" + startTime + ", end =" + endTime  ;
	}

	@Override
	public int compareTo(Seance o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
