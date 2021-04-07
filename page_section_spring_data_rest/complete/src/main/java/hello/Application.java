package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.repository")
@EntityScan("com.example.entity")
@EnableCaching
public class Application {

	public static void main(String[] args) {
		System.out.println("Begining....");
		SpringApplication.run(Application.class, args);
		System.out.println("This is the end............");
	}
}
