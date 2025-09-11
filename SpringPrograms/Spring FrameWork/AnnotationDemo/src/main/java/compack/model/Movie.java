package compack.model;

public class Movie {
	private final String name;
	private final int year;
	public Movie(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
}
