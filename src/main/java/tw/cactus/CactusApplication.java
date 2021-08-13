package tw.cactus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("tw.cactus")
public class CactusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CactusApplication.class, args);
	}

}
