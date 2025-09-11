package compack.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import compack.model.Movie;

@Repository

public class MovieRepository {
	@Autowired
	 ArrayList<Movie> moviesList;
	public List<Movie>findByYear(int year){
		List<Movie> foundList = new ArrayList<>();
		for(Movie movie : moviesList) {
		if(movie.getYear()==year)
			foundList.add(movie);
		}
		return foundList;
		
	}


}
