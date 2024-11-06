package in.chaithanya.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	public UserService() { //object is created on IOC container
		System.out.println("UserService:: Constructor");
	}

}
