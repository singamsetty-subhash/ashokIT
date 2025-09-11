package compack.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import compack.model.Movie;

@Configuration
@ComponentScan("compack")
public class AppConfig {
	@Bean
	public ArrayList<Movie>mList(){
		ArrayList<Movie>arrList=new ArrayList<Movie>();
		arrList.add(new Movie("Chaava", 2025));
		arrList.add(new Movie("Pushpa2", 2024));
		arrList.add(new Movie("Yodha", 2024));
		arrList.add(new Movie("Kalki", 2024));
		arrList.add(new Movie("Game Changer", 2025));
		return arrList;		
	}
}
