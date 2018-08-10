package se.predictly.jxweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
                System.out.println("Hello world, I'm starting up");
		SpringApplication.run(DemoApplication.class, args);
	}
}
