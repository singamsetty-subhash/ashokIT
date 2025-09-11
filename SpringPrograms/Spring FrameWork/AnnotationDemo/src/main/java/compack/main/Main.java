package compack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import compack.config.AppConfig;
import compack.service.MovieService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MovieService service = ctx.getBean(MovieService.class);
		service.showMovies(2024);
	}

}
