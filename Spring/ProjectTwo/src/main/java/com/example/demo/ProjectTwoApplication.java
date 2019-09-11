package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProjectTwoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(ProjectTwoApplication.class, args);
		System.out.println("Project Two!!");
		
		Alien a = context.getBean(Alien.class);
		a.display();
	}

}
