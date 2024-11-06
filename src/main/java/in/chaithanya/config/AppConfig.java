package in.chaithanya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig:: Constructor");
	}
	@Bean   //IOC Container call the method
	public AppConfig createInstance() {
		AppConfig as=new AppConfig();   //custom logic to secure our functionality
		return as;
		
	}
	

}
