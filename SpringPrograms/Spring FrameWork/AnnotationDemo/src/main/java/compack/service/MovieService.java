package compack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import compack.model.Movie;
import compack.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository repository;
	
	public void showMovies(int year) {
		List<Movie> lst = repository.findByYear(year);
		for(Movie m : lst) {
			System.out.println("Name  : " + m.getName());
			System.out.println("Year  : " + m.getYear());
			System.out.println("===========================");
		}
	}

}
