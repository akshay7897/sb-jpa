package com.ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ap.entity.Parent;
import com.ap.service.ParentService;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JpaApplication.class, args);
		
		ParentService parentService = applicationContext.getBean(ParentService.class);
		parentService.save();
		
		
		Parent parent = parentService.getStudent();
		
		System.out.println(parent);
		
		
	}

}
