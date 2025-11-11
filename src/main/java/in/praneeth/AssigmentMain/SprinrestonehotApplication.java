package in.praneeth.AssigmentMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("in.praneeth")
@EntityScan("in.praneeth.Entity")
public class SprinrestonehotApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprinrestonehotApplication.class, args);
	}

}
