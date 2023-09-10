package com.falcon.spring.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHttpsDemoApplication {

	@GetMapping("/getData")
	public String getMessage(){
		return "Accessed by https ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringHttpsDemoApplication.class, args);
	}

}
