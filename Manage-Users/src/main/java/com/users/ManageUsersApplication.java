package com.users;

import com.users.entity.User;
import com.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManageUsersApplication implements CommandLineRunner {
    @Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ManageUsersApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting code...............");

		User newUser= new User();
		newUser.setFirstname("Rohit");
		newUser.setLastname("Saini");
		newUser.setEmail("rohit12@gamil.com");
		newUser.setUsername("rohit12");
		newUser.setPassword("1234567");
		newUser.setPhone("1234567890");

//		User user1 = this.userService.createUser(newUser);
//		System.out.print(user1);

	}
}
