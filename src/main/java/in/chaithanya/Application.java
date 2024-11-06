package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.chaithanya.security.AppSecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"in.chaithanya" ,"com.wallmart"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	

}
