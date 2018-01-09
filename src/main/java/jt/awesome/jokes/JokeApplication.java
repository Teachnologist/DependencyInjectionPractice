package jt.awesome.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jt.awesome.jokes.services.JokeService;

@SpringBootApplication
public class JokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokeService.class, args);
	}
}
